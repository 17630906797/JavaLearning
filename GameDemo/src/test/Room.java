package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
          // 必须有一副牌
          private List<Card> allCards = new ArrayList<>();

          public Room() {
                    // 做出54张牌，并且存入集合中
                    // 点数：
                    String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
                    // 准备花色数据
                    String[] colors = {"♥", "♣", "♠", "♦"};
                    //遍历点数，再遍历花色
                    int size = 0;
                    for (String number : numbers) {
                              size++;
                              for (String color : colors) {
                                        //  创建一个牌
                                        Card card = new Card(number, color, size);
                                        allCards.add(card);// 把牌存入集合
                              }

                    }
                    //  单独创建大小王的牌
                    Card card1 = new Card(" ", "大王♛", 56);
                    Card card2 = new Card(" ", "小王♛", 55);
                    Collections.addAll(allCards, card1, card2);
                    System.out.println("新牌展示：" + allCards);
          }

          // 启动游戏程序的步骤
          public void strart() {
                    // 第一步先把牌洗牌，打乱
                    Collections.shuffle(allCards);
                    System.out.println("洗牌后展示：" + allCards);

                    // 第二步创建三个游戏玩家
                    List<Card> player1 = new ArrayList<>();
                    List<Card> player2 = new ArrayList<>();
                    List<Card> player3 = new ArrayList<>();

                    // 第三步，对三个玩家发牌
                    int count = 0;
                    for (int i = 0; i < allCards.size() - 3; i++) {
                              Card card = allCards.get(i);
                              // 轮询发牌
                              if (i % 3 == 0) {
                                        player1.add(card);
                                        count++;
                              } else if (i % 3 == 1) {
                                        player2.add(card);
                                        count++;
                              } else {
                                        player3.add(card);
                                        count++;
                              }

                    }
                    System.out.println("共发了" + count + "张牌");
                    // 留底牌作为一个重新的集合
                    List<Card> LastCards = allCards.subList(51, 54);
                    System.out.println("牌底3张的牌为：" + LastCards);


                    // 第四步 对每个玩家的手牌进行排序
                    sortcards(player1);
                    sortcards(player2);
                    sortcards(player3);
                    System.out.println("玩家1的牌是："+player1);
                    System.out.println("玩家2的牌是："+player2);
                    System.out.println("玩家3的牌是："+player3);
          }

          private void sortcards(List<Card> cards) {
                    Collections.sort(cards, new Comparator<Card>() {
                              @Override
                              public int compare(Card o1, Card o2) {
                                        return o1.getSize()-o2.getSize();
                              }
                    });
          }

}
