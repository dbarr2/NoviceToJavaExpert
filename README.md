# Java Development Diary

This repository documents my 100-day journey of advancing from a novice to an expert in Java. 
It captures my daily progress, challenges faced, and the solutions I developed. 
The projects build upon each other, emphasizing core Java concepts such as 
Object-Oriented Programming, network programming, databases, and more. This repository starts from Day 3 because this is when the topics being revisted 
or newly learned build on top of each other

## Day 3: Introduction to Classes and Objects

**Objective:** Grasp the fundamentals of classes and objects in Java, focusing on constructors, methods, and the principles of encapsulation.

### Challenge Summary
- Created a `Person` class with `name`, `age`, and `favoriteColor` fields.
- Implemented methods within the `Person` class to introduce the person and celebrate their birthday.
- Explored how objects of the `Person` class can interact with these methods.

### Key Concepts
- **Classes and Objects:** The backbone of Java's OOP model, allowing for the creation of custom data types with both state and behavior.
- **Encapsulation:** Demonstrated by making `Person` class fields private and interacting with them through public methods.

## Day 4: Inheritance and Interfaces

**Objective:** Dive deeper into OOP with inheritance and interfaces, understanding their role in polymorphism and code reuse.

### Challenge Summary
- Extended the `Person` class with a `Student` subclass, adding `studentId` and `major` fields.
- Implemented the `Learner` interface with a `study()` method, adopted by the `Student` class.

### Key Concepts
- **Inheritance:** Allows a class to inherit fields and methods from another class, promoting code reuse.
- **Interfaces:** Defines a contract for classes, ensuring they provide implementations for certain behaviors.

## Day 5: Collections Framework

**Objective:** Learn to utilize Java's Collections Framework for storing, retrieving, and manipulating data.

### Challenge Summary
- Utilized `ArrayList` to manage a dynamic array of `Person` objects.
- Explored `HashSet` for unique collections of courses.
- Implemented `HashMap` to map students' names to their course lists.

### Key Concepts
- **List, Set, Map:** Core interfaces of the Collections Framework, each serving distinct data management purposes.
- **Generics:** Enabled type-safe collections, ensuring compile-time safety for collection elements.

## Day 7: Interfaces and Abstract Classes

**Objective:** Explore the utilization of interfaces and abstract classes, focusing on their use cases and advantages in designing a flexible and maintainable object-oriented system.

### Challenge Summary
- Modified the `Learner` interface to include a new method, `takeExam()`, enhancing its capabilities and ensuring all implementing classes provide exam-taking functionality.
- Created an abstract class `OnlineStudent` that extends the `Student` class, providing a specific implementation of the `study()` method and defining the structure for online student behaviors through an abstract method `attendVirtualClass()`.
- Implemented the `takeExam()` method in the `Student` class, following the contract established by the modified `Learner` interface.
- Developed a concrete subclass `DistanceLearner` of the `OnlineStudent` abstract class, realizing the abstract behavior by implementing the `attendVirtualClass()` method, thereby demonstrating how a class can take shape from an abstract blueprint.

### Key Concepts
- **Interface Expansion:** Illustrated the impact of adding new methods to an interface and how it necessitates changes in implementing classes.
- **Abstract Classes vs. Interfaces:** Delved into the distinction between abstract classes and interfaces, understanding when to use each construct.
- **Concrete Implementations:** Showcased the process of developing concrete classes from abstract ones and fulfilling the contract of an interface.

### Reflection
The activities of Day 7 provided a deeper insight into the object-oriented design and its principles, highlighting the balance between abstraction, encapsulation, and polymorphism. The hands-on experience reinforced the theoretical understanding of these concepts and showcased their practical applications in a Java-based environment.

---



---

Feel free to fork or star this repository if you find my journey inspiring or educational. Your support is greatly appreciated!
