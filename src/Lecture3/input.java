package Lecture3;

import java.util.Scanner;

 

public class input{

             

             //*void ageover18() throws 
             

              public static void main(String[]args){

             

                            Scanner scanner = new Scanner(System.in);

                           

                            System.out.println("How old are you?");

                           

                            boolean operationissuccessful = false;

                           

                            int retryattempts = 0;

                            int maxretries = 5;

                           

                            while(operationissuccessful ==false && retryattempts < maxretries ){

                            try {

                                          int age = scanner.nextInt();

                                         

                                         

                                                         if (age>17){

                                          if (age!=18){System.out.println("You are " +age+ " years old! \nHere is your QR-Code to vote.");

                                          }

                            else {

                                          System.out.println("You are lucky! \nYou just got old enough to vote.\n Here is your QR-Code");

                                         

                            }// end of else

                            }// end of if statement

                           

                            else {

                                         

                                          System.out.println("You are not old enough to vote. \nYou have to wait some more time but in the meantime you can learn some more about politics.");

                                         

                            }// end of else

                           

                            operationissuccessful = true;

                           

                           

                            }

                          

                            catch (Exception a) {

                                         

                                          System.out.println("Please only type in whole numbers");

                                         

                                         retryattempts++;

                                    
                                  }
                                }

                                scanner.close();
//
                            }

                            // ageover18 agechecker = new ageover18();

                            /*try {

                                                                       if (age>17){

                                          if (age!=18){System.out.println("You are " +age+ " years old! \nHere is your QR-Code to vote.");

                                          }

                            else {

                                          System.out.println("You are lucky! \nYou just got old enough to vote.\n Here is your QR-Code");

                                         

                            }// end of else

                            }// end of if statement

                           

                            else {

                                         

                                          System.out.println("You are not old enough to vote. \nYou have to wait some more time but in the meantime you can learn some more about politics.");

                                         

                            }// end of else

 

                            }// end of try*//*

                            catch (Exception e) {

                                         

                                          System.out.println("Please only type in whole numbers");

                            }*/

              }

 

            

