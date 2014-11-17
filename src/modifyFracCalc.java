import java.util.Scanner;

	public class modifyFracCalc {

		public static void main(String[] args) {
			//declare variables for FracCalc 
			String expression="start";
			String num1="3";
			String den1="3";
			String wholeNum1 = "3";
			String wholeNum2 = "4";
			String num2 = "4";
			String den2 = "4";
			Scanner scan = new Scanner(System.in);
			
			while(true){
		//ask for user input or quit
			System.out.println("Please enter a fractional math problem (or quit).");
			expression = scan.nextLine();
			if(expression.equals("quit"))break;
		//split expression at the space to break it up into the first fraction, the operator and the second fraction
			String [] parts = expression.split(" ");
			String fraction1 = parts[0];
			String operator = parts[1];
			String fraction2 = parts[2];
		//find if the first term is a mixed number	
			if( fraction1.indexOf("_") != -1){
						String [] partsFraction1 = fraction1.split("_");
						wholeNum1 = partsFraction1[0];
						String frac = partsFraction1[1];
				//find numerator and denominator of FIRST fraction
						String [] partsFirstFrac = frac.split("/");
						num1 = partsFirstFrac[0];
						den1 = partsFirstFrac[1];
				//if there is no mixed number or fraction, that means it's only a whole number
				}else if(fraction1.indexOf("_") == -1 && fraction1.indexOf("/") == -1){
					    wholeNum1 = fraction1;
					    num1 = "0";
					    den1 = "1";
				//otherwise, it is just a fraction with no whole number
				}else{
						String [] partsFraction1 = fraction1.split("/");
						wholeNum1 = "0";
						num1 = partsFraction1[0];
						den1 = partsFraction1[1];
						}
			//parse first num/den/wholeNum 
					int Num1 = Integer.parseInt(num1);
					int Den1 = Integer.parseInt(den1);
					int WholeNum1 = Integer.parseInt(wholeNum1);
			//if the numerator is bigger than the denominator (improper fraction)
				if(Math.abs(Num1) >= Den1 && WholeNum1 > 0){
					WholeNum1 = Math.abs(Num1/Den1) + Math.abs(WholeNum1);
					Num1 = Math.abs(Num1 % Den1);
				}
				if(Math.abs(Num1) >= Den1 && WholeNum1 < 0){
					WholeNum1 = Math.abs(Num1/Den1) + Math.abs(WholeNum1);
					WholeNum1 *= -1;
					Num1 = Math.abs(Num1 % Den1);
				}
			//find the whole number and fraction of the SECOND fraction/mixed number
				if( fraction2.indexOf("_") != -1){
						String [] partsFraction2 = fraction2.split("_");
						wholeNum2 = partsFraction2[0];
						String frac2 = partsFraction2[1];
					//find numerator and denominator of FIRST fraction
						String [] partsSecondFrac = frac2.split("/");
						num2 = partsSecondFrac[0];
						den2 = partsSecondFrac[1];
				//if the second term is not a mixed number or a fraction, it's just a whole number
				}else if(fraction2.indexOf("_") == -1 && fraction2.indexOf("/") == -1){
					    wholeNum2 = fraction2;
					    num2 = "0";
					    den2 = "1";
				//otherwise the second term is just a fraction
				}else{
						String [] partsFraction2 = fraction2.split("/");
						wholeNum2 = "0";
						num2 = partsFraction2[0];
						den2 = partsFraction2[1];
						}	
		//parse second num/den/wholenum
			int WholeNum2 = Integer.parseInt(wholeNum2);
			int Num2 = Integer.parseInt(num2);
			int Den2 = Integer.parseInt(den2);
		//if numerator is bigger than denominator (improper fraction)
			if(Math.abs(Num2) >= Den2 && WholeNum2 >0){
				WholeNum2 = Num2/Den2 + WholeNum2;
				Num2 = Num2 % Den2;
			}
			if(Math.abs(Num2) >= Den2 && WholeNum2 <0){
				WholeNum2 = (Num2/Den2 + WholeNum2) * -1;
				Num2 = Num2 % Den2;
			}
			//if the second fraction is negative and the operator is "-". Adjust and add.
			if(operator.equals("-") && fraction2.charAt(0) == '-'){
				WholeNum2 = Math.abs(WholeNum2);
				Num2 = Math.abs(Num2);
				operator = "+";
			}
			
			if(operator.equals("-") && (WholeNum2 <0 || Num2 < 0)){
				WholeNum2 = Math.abs(WholeNum2);
				Num2 = Math.abs(Num2);
				operator = "-";
			}
			//find the lcm 
			int lcm = (Den1*Den2)/gcd(Den1,Den2);
			
		//get new numerators for the new denominators (lcm)
			int NewNum1 = (lcm/Den1)*Math.abs(Num1) + Math.abs(WholeNum1*lcm);
			int NewNum2 = (lcm/Den2)*Math.abs(Num2) + Math.abs(WholeNum2*lcm);
		
		if(Num1 < 0 || WholeNum1 < 0){
			NewNum1 = NewNum1 * -1;			
		}
		
		if(Num2 < 0 || WholeNum2 < 0){
			NewNum2 = NewNum2 * -1;
		}
		//get whole numbers and remainders
			
			int remainder2 = Math.abs(NewNum2) % lcm;
			
		//turns mixed numbers into improper fractions for * operator
			int Num1product = Math.abs(Num1)+ Math.abs(WholeNum1*Den1);
			int Num2product = Math.abs(Num2)+ Math.abs(WholeNum2*Den2);
			
			if(Num1 < 0 || WholeNum1 < 0){
				Num1product = Num1product* -1;
			}
			
			if(Num2 < 0 || WholeNum2 < 0){
				Num2product = Num2product * -1;
			}
			if(operator.equals("*")){
				int productDenominator = (Den1*Den2);
				int productNumerator = 	(Num1product * Num2product)%productDenominator;
				int productWholeNum = (Num1product * Num2product)/productDenominator;
				int gcd2 = gcd2(productNumerator, productDenominator);
			//reduce the fraction if needed
				productNumerator = productNumerator/Math.abs(gcd2);
				productDenominator = productDenominator/Math.abs(gcd2);
				
				//if loop: finds if one or both terms are negative
				if((fraction1.charAt(0) == '-' && fraction2.charAt(0)== '-') || (fraction1.charAt(0) != '-' && fraction2.charAt(0) != '-')){
					productNumerator = Math.abs(productNumerator);
					productDenominator = Math.abs(productDenominator);
					productWholeNum = Math.abs(productWholeNum);
					
					if(productDenominator == 1 ){
						System.out.println(productWholeNum);
					}else if((productNumerator % productDenominator) != productNumerator && productNumerator % productDenominator == 0){
						System.out.println(productWholeNum);
					}else if(productNumerator % productDenominator != productNumerator){
						//don't include whole number if its 0
						if(productWholeNum == 0){
							System.out.println((productNumerator%productDenominator)+"/"+productDenominator);
						}else{
							//don't include numerator in answer if it equals 0
							if(productNumerator == 0){
								System.out.println(productWholeNum);
							}else{	
							System.out.println(productWholeNum+"_"+ Math.abs((productNumerator%productDenominator))+"/"+productDenominator);
						}}
					}else{
						//if whole number = 0, don't include in the answer
						if(productWholeNum == 0){
							System.out.println(productNumerator+"/"+productDenominator);
						}else{
							//if numerator = 0, don't include fraction in the answer
							if(productNumerator == 0){
								System.out.println(productWholeNum);
							}else{
							System.out.println(productWholeNum + "_"+Math.abs(productNumerator)+"/"+productDenominator);	
							}	
						}
					}		
				}else if((fraction1.charAt(0) != '-' && fraction2.charAt(0) == '-' )|| (fraction1.charAt(0)== '-' && fraction2.charAt(0) != '-')){
					if((productNumerator % productDenominator) != productNumerator){
						System.out.println(productWholeNum+(productNumerator/productDenominator));
					}else{//don't include whole number if it equals 0
						if(productWholeNum == 0){
							System.out.println(productNumerator+"/"+productDenominator);
						//don't include numerator if it equals 0
						}else if(productNumerator == 0){
							System.out.println(productWholeNum);
						}else{
							System.out.println(productWholeNum + "_"+Math.abs(productNumerator)+"/"+productDenominator);
						}
					}	
				}
			}else if(operator.equals("+")){
				int sumDenominator = lcm;
				int sumNumerator = (NewNum1 +NewNum2)% sumDenominator;
				int sumWholeNum =((NewNum1+NewNum2)/sumDenominator);
				int gcd3= gcd3(sumNumerator, sumDenominator);
			//reduce fraction if needed	
				sumNumerator = sumNumerator/Math.abs(gcd3);
				sumDenominator = sumDenominator/Math.abs(gcd3);
				
				if(sumNumerator == sumDenominator){
						System.out.println(sumWholeNum+1);
					}else if(sumNumerator % sumDenominator == 0){
						System.out.println(sumWholeNum+(sumNumerator/sumDenominator));
					}else{
						if(sumWholeNum == 0){
							System.out.println(sumNumerator+"/"+sumDenominator);
						}else{
						System.out.println(sumWholeNum+"_"+Math.abs(sumNumerator)+"/"+sumDenominator);
						}
					}
			}else if(operator.equals("-")){
				
				int differenceDenominator =(lcm);
				int differenceWholeNum = ((NewNum1-NewNum2)/differenceDenominator);
				int differenceNumerator =((NewNum1-NewNum2)%differenceDenominator); 
				int gcd4= gcd4(differenceNumerator, differenceDenominator);
				//reduce fraction if needed	
				differenceNumerator = differenceNumerator/(Math.abs(gcd4));
				differenceDenominator = differenceDenominator/(Math.abs(gcd4));
				
				
				if(differenceNumerator == 0 && differenceWholeNum == 0){
						System.out.println("0");
					//if numerator is 0, don't include
					}else if(differenceNumerator == 0){
						System.out.println(differenceWholeNum);
					//if whole number equals 0, don't include
					}else if(differenceWholeNum == 0){
						System.out.println(differenceNumerator+"/"+ differenceDenominator);	
					}else{
						System.out.println(differenceWholeNum + "_"+ Math.abs(differenceNumerator)+ "/"+differenceDenominator);
					}
			}else if(operator.equals("/")){
				//if statement if both inputs are positive
				if(fraction1.charAt(0) != ('-') && fraction2.charAt(0) != ('-')){
					int quotientNumerator = (NewNum1*lcm);
					int quotientDenominator = Math.abs((lcm *(WholeNum2*lcm+NewNum2)));
					if(Num2 < Den2){
						  quotientDenominator = Math.abs((lcm *(WholeNum2*lcm+remainder2)));}
					
					int gcd5 = gcd5(quotientNumerator, quotientDenominator);
					
					quotientNumerator = quotientNumerator/Math.abs(gcd5);
					quotientDenominator = quotientDenominator/Math.abs(gcd5);
					
						if((quotientNumerator % quotientDenominator) != quotientNumerator && (quotientNumerator % quotientDenominator) != 0){
							System.out.println((quotientNumerator/quotientDenominator)+"_"+Math.abs((quotientNumerator % quotientDenominator))+"/"+ quotientDenominator);
							}else if((quotientNumerator % quotientDenominator == 0)){
								System.out.println(quotientNumerator/quotientDenominator);
							}else{
								System.out.println(quotientNumerator + "/"+ quotientDenominator);
				}//end of nested if
				}//end of else if / statement
				//if both inputs are negative (the answer would be the same)
				else if(fraction1.charAt(0) == '-' && fraction2.charAt(0) == '-'){
					int quotientNumerator = Math.abs(NewNum1*lcm);
					int quotientDenominator = Math.abs((lcm *(Math.abs(WholeNum2)*lcm+NewNum2)));
					if(Num2 < Den2){
						  quotientDenominator = Math.abs((lcm *(WholeNum2*lcm+remainder2)));}
					int gcd5 = gcd5(quotientNumerator, quotientDenominator);
					
					quotientNumerator /= Math.abs(gcd5);
					quotientDenominator /= Math.abs(gcd5);
							
					if((quotientNumerator % quotientDenominator) != quotientNumerator && (quotientNumerator % quotientDenominator) != 0){
								System.out.println((quotientNumerator/quotientDenominator)+"_"+Math.abs((quotientNumerator % quotientDenominator))+"/"+ (quotientDenominator));
							}else if((quotientNumerator % quotientDenominator == 0)){
								System.out.println(quotientNumerator/quotientDenominator);
							}else{
								System.out.println((quotientNumerator) + "/"+ (quotientDenominator));
							}}
				//if one input is positive and the other is negative
				else if((fraction1.charAt(0) == '-' && fraction2.charAt(0) != '-')||(fraction1.charAt(0) != '-' && fraction2.charAt(0) == '-')){
					int quotientDenominator = Math.abs((lcm *(Math.abs(WholeNum2)*lcm+NewNum2)));
					if(Num2 < Den2){
						  quotientDenominator = Math.abs((lcm *(WholeNum2*lcm+remainder2)));}
					int quotientNumerator = (NewNum1*lcm);
					int gcd5 = gcd5(quotientNumerator, quotientDenominator);
					if(quotientNumerator < quotientDenominator && quotientNumerator % gcd5 == 0){
						quotientNumerator /= Math.abs(gcd5);
						quotientDenominator /= Math.abs(gcd5);
					}	
						if((quotientNumerator % quotientDenominator) != quotientNumerator && (quotientNumerator % quotientDenominator) != 0){
						System.out.println((quotientNumerator/quotientDenominator)+"_"+Math.abs((quotientNumerator% quotientDenominator))+"/"+ quotientDenominator);
						}else if((quotientNumerator % quotientDenominator == 0)){
							System.out.println(quotientNumerator/quotientDenominator);
						}else{
							System.out.println(quotientNumerator + "/"+ quotientDenominator);
							}		
				}else{
					System.out.println("Error.");
					}
				}//end of if statement for all operators		
	    }//end of while loop 
		scan.close();	
		}//end of main method

	//gcd/lcm for addition and subtraction
		public static int gcd(int Den1, int Den2){
			if(Den2 == 0){
				return Den1;
			}else{return gcd(Den2, Den1 % Den2);
		}}
	//gcd3 to reduce addition
		public static int gcd3(int sumNumerator,int sumDenominator){
			if(sumDenominator == 0){
				return sumNumerator;
			}else{return gcd(sumDenominator,sumNumerator % sumDenominator);
			}	
		}
	//gcd4 to reduce subtraction
		public static int gcd4(int differenceNumerator,int differenceDenominator){
			if(differenceDenominator == 0){
				return differenceNumerator;
			}else{return gcd(differenceDenominator,differenceNumerator % differenceDenominator);
			}	
		}
	//gcd2 to reduce products
		public static int gcd2(int productNumerator, int productDenominator){
			if(productDenominator == 0){
				return productNumerator;
			}else{return gcd2(productDenominator, productNumerator % productDenominator);
		}}
		public static int gcd5(int quotientNumerator, int quotientDenominator){
			if(quotientDenominator == 0){
				return quotientNumerator;
			}else{return gcd5(quotientDenominator, quotientNumerator % quotientDenominator);
			}
		}
	}//end of class