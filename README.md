# java_final_project# Final Project

This is the final project for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

## Introduction

During our first week in class we mainly learned about Git and Github. After talking with a friend who works in the coding field about github I found out that it, or a renamed version of it, is a fairly common thing in the work place. Our main focus was on memorizing the commands for git to put our repository onto Github. Such as adding committing and pushing.
 
One of the things that I also found really interesting was how easy it made sharing code. Instead of zipping the file or copy and pasting a whole block of code, I could simply copy and paste a link to my repository.

## Chapter 1

Our Main focus for chapter one was on creating variables and getting user input. Creating variables in Java is very similar to that of creating variables in python. However, in creating a variable in Java you have to declare the data type. I can see this as both a blessing and a curse mainly due to the fact of numbers. You cannot cross an ints and doubles. However if a user inputs an int, let's say 5, into a double variable it turns it into 5.0. Yet it doesn’t do it the other way around. That makes me wonder why you wouldn’t always use doubles.

## Chapter 2

Our largest focus was on boolean statements, math operators, and casting of data types. Such as using && for "and" or || for "or" and ! for "not". I feel like other than using these the if statements are practically the same thing as they are in python. As for math operators I found it fairly easy as long as I followed the order of operations. Casting of data types I actually found quite interesting in what can go what ways. Such as you do not need to cast from an int to a double however you do for vise versa.

## Chapter 3

This chapter we mainly focused on types of loops, plus the switch statements. I found it interesting the difference between the while loop and a do-while loop. In my opinion they are practically saying the same thing, except for the condition being in different places. I liked how the changing of the condition is done within the declaration of the condition in the for loop rather than possibly forgetting to change the condition in a while loop. I don’t know if I am a massive fan of using case statements, as in code lab it wouldn’t allow for testing of characters that are between others. Such as testing for 1-3 instead of having to test for 1, 2, and 3 in different case statements. 

## Chapter 4

During Chapter four we had mainly focused upon creating methods within classes. I had actually found this week to be fairly easy as the process of creating these methods were practically the same as in my .Net course covering C sharp. I found it fairly easy to know when to put a void tag or the return type on the method itself, however I still feel like I may need more practice with static versus non-static and public versus private.

## Chapter 5

In chapter 5 we took a really deep dive into arrays and manipulating them. I really enjoyed doing the chapter 5 challenge as it actually had me thinking hard for a bit. However I feel like at its core we had worked on this or something similar in programming logic and the manipulation of arrays. However, one thing that was new to me was using a for-each loop. I feel like it would be easier writing this 
```java
for (int num : nums)
``` 
rather than this: 
```java
for (int i = 0, i <= nums.length - 1; i++)
```

## User Stories

- As a MTG player I want to ***add cards to my hand***, so that I can simulate drawing a card.
- As a MTG player I want to be able to ***view all of my cards*** in my hand t know what I have to play.
- As a MTG player I want to be able to ***see all of my cards*** in the hand of a ***specific color***.
- As a MTG player I want to be able to ***sort my cards*** by their converted mana cost.
- As a MTG player I want to be able to ***see the details of a specific card***.
- As a MTG player I want to be able to ***move cards*** to simulate putting cards next to eachother for combo planning.
- As a MTG player I want to be able to ***shuffle the location*** so that an opponite can chose a card at random.
- As a MTG player I want to be able to ***remove cards*** to simulate playing a card.

## Class Diagram

| +Card |
|:-------|
| - cardName: String <br>- cardColor: String <br> - convertedManaCost: ManaCost <br>|
|<\<create>\> +Card() <br> <\<create>\> +Card(cardName: String, cardColor: String, convertedMana: ManaCost) <br><br> +getCardName(): String <br> +setCardName(cardName: String): void <br> +setCardColor(cardColor: String) <br> +getCardColor(): String <br> +getCMC(): ManaCost <br> +setCMC(convertedMana: ManaCost): Void<br> +removeCards(): Void <br> +getCMCtoString(convertedMannaCost: ManaCost): String<br><br> -validateName(cardName: String): Void 

| +LandCard extends Card |
|:-------|
| - landType: String|
|<\<create>\> +LandCard <br> <\<create>\> LandCard(landType: String)<br><br> +getLandType(): String <br> +setLandType(landType: String) <br><br> -validateLandType(landType: String)|

| +ManaCost |
|:-------|
| -numOfRed: int <br> -numOfBlue: int <br> -numOfWhite: int <br> -numOfGreen: int <br> -numOfBlack: int <br> -numOfColorless: int <br> |
|<\<create>\> +ManaCost <br> <\<create>\> +ManaCost(numOfRed: int, numOfBlue: int, numOfWhite: int, numOfGreen: int, numOfBlack: int, numOfColorless: int) <br><br>+getNumOfRed(): int <br> +getNumOfBlue(): int <br> +getNumOfWhite(): int <br> +getNumOfGreen(): int <br> +getNumOfBlack(): int <br> +getNumOfColorless(): int <br><br>+setNumOfRed(numOfRed: int): void <br> +setNumOfBlue(numOfBlue: int): void <br> +setNumOfWhite(numOfWhite: int): void <br> +setNumOfGreen(numOfGreen: int): void <br> +setNumOfBlack(numOfBlack: int): void <br> +setNumOfColorless(numOfColorless: int): void <br><br>-validateCost(int)|

