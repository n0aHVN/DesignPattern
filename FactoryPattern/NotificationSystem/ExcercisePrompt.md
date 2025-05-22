# This is Simple Factory (Factory Method) practicing

# 🧪 Factory Pattern Practice Exercise: Notification System
# 🗂 Scenario
You're building a notification system for a platform that supports multiple communication channels. These include:

- Email

- SMS

- Push Notifications

Each notification type must implement a method to notify the user in a way appropriate to its channel.


# 🎯 Your Task
- Define a common interface or abstract class that all notification types will implement.
- Create three concrete classes for each notification type (Email, SMS, Push).
- Create a factory class that decides which notification to create based on a string input.
- Write client code that uses the factory to create a notification and sends it.

# ✅ Requirements
- No direct new keyword in the client code for creating notification instances.

- The factory should handle unknown input types gracefully (e.g., throw an exception or return null).

- Make the code extensible so that adding a new notification type in the future is easy.