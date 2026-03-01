# RPG-Adventure-Simulator
This project is a Java console application that simulates a basic character and equipment management system for a role-playing game (RPG). It allows users to interact with legendary adventurers, customize their weaponry, and execute combat actions through a command-line interface.

ID Management: Every adventurer is assigned a unique, auto-incremental ID upon instantiation.

Equipment System: Characters can be equipped with custom weapons that have specific names and damage values.

Combat Logic: If an adventurer is unarmed, they attack with their fists (base damage of 1). Once equipped, the system dynamically updates the attack message to include the weapon's stats.

Interactive Menu: A comprehensive console menu to:

Equip weapons to specific characters.

Execute attacks and view damage output.

Check detailed character status (level, ID, equipment).

Data Validation: Implementation of try-catch blocks to handle NumberFormatException and prevent application crashes.

Code Structure
The project is organized into three main classes:

Aventurero.java: The entity class representing the hero. It contains the logic for attacking and holds the reference to the Arma object.

Arma.java: A class defining equipment properties, including name and damage points.

Principal.java: The main engine of the program. It manages the menu, handles Scanner input, and coordinates interactions between users and objects.
