package ATM;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class gptTest {
          private String fileName;

          public gptTest(String fileName) {
                    this.fileName = fileName;
          }

          // 创建本地文档
          public void createAccountFile() {
                    try {
                              File file = new File(fileName);
                              if (file.createNewFile()) {
                                        System.out.println("本地文档已创建: " + fileName);
                              } else {
                                        System.out.println("本地文档已存在: " + fileName);
                              }
                    } catch (IOException e) {
                              System.out.println("创建本地文档时出错: " + e.getMessage());
                    }
          }

          // 添加账户信息到本地文档
          public void addAccount(Account account) {
                    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
                              outputStream.writeObject(account);
                              System.out.println("账户信息已添加到本地文档: " + account.getCardid());
                    } catch (IOException e) {
                              System.out.println("添加账户信息时出错: " + e.getMessage());
                    }
          }

          // 从本地文档读取所有账户信息
          public List<Account> getAllAccounts() {
                    List<Account> accounts = new ArrayList<>();
                    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
                              while (true) {
                                        Account account = (Account) inputStream.readObject();
                                        accounts.add(account);
                              }
                    } catch (EOFException e) {
                              // 文件读取结束
                    } catch (IOException | ClassNotFoundException e) {
                              System.out.println("读取账户信息时出错: " + e.getMessage());
                    }
                    return accounts;
          }

          // 根据卡号查找账户
          public Account findAccountByCardId(String cardId) {
                    List<Account> accounts = getAllAccounts();
                    for (Account account : accounts) {
                              if (account.getCardid().equals(cardId)) {
                                        return account;
                              }
                    }
                    return null; // 找不到对应的账户
          }

          // 根据卡号删除账户信息
          public void deleteAccountByCardId(String cardId) {
                    List<Account> accounts = getAllAccounts();
                    List<Account> updatedAccounts = new ArrayList<>();

                    for (Account account : accounts) {
                              if (!account.getCardid().equals(cardId)) {
                                        updatedAccounts.add(account);
                              }
                    }

                    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                              for (Account account : updatedAccounts) {
                                        outputStream.writeObject(account);
                              }
                              System.out.println("账户信息已删除，卡号: " + cardId);
                    } catch (IOException e) {
                              System.out.println("删除账户信息时出错: " + e.getMessage());
                    }
          }

          // 更新账户信息
          public void updateAccount(Account updatedAccount) {
                    List<Account> accounts = getAllAccounts();
                    List<Account> updatedAccounts = new ArrayList<>();

                    for (Account account : accounts) {
                              if (account.getCardid().equals(updatedAccount.getCardid())) {
                                        updatedAccounts.add(updatedAccount);
                              } else {
                                        updatedAccounts.add(account);
                              }
                    }

                    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                              for (Account account : updatedAccounts) {
                                        outputStream.writeObject(account);
                              }
                              System.out.println("账户信息已更新: " + updatedAccount.getCardid());
                    } catch (IOException e) {
                              System.out.println("更新账户信息时出错: " + e.getMessage());
                    }
          }
}
