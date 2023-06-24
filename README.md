# Assignment Submission Alert System

## Description
The Assignment Submission Alert System is a Java-based application designed to facilitate group communication for assignment submissions. The system utilizes the Observer Design Pattern to provide timely notifications to users regarding assignment submissions, updates, and group membership management.

## Task Allocation

- Notifications: BAHINDI EMMANUEL
- Failure Detection: ECHERU RODNEY
- Group Address Expansion: ZINDAZED
- Group Membership Management: AINEMBABAZI JESSE
- Authentication: MULEKWA EMMANUEL

## Features

- Real-time notifications: Users receive instant notifications about new assignment submissions, updates, and other relevant information.
- Failure detection: The system monitors for any failures or errors and promptly alerts users or administrators.
- Group address expansion: Group addresses are resolved to individual member addresses for targeted notifications and efficient communication.
- Group membership management: Users can be added or removed from groups, and changes in group membership are accurately maintained.
- Authentication: User authentication and authorization ensure secure access to the Assignment Submission Alert System.

## Group Chat Application MySQL Database Tables

1. **Users table**: This table stores information about the users registered in the application.
   - `user_id`: Unique identifier for each user.
   - `username`: User's username or display name.
   - `password`: User's password (hashed and salted for security).
   - `email`: User's email address.
   - Additional columns as per your requirements (e.g., profile picture, date of birth, etc.).

2. **Groups table**: This table stores information about the groups created in the application.
   - `group_id`: Unique identifier for each group.
   - `group_name`: Name or title of the group.
   - `created_by`: User ID of the user who created the group.
   - Additional columns as per your requirements (e.g., group description, creation date, etc.).

 3. **GroupMembers table**: This table establishes a many-to-many relationship between users and groups, indicating which users are members of which groups.
   - `group_id`: The group's unique identifier.
   - `user_id`: The user's unique identifier.
   - Additional columns as per your requirements (e.g., role in the group, joining date, etc.).

4. **Messages table**: This table stores the messages sent within the groups.
   - `message_id`: Unique identifier for each message.
   - `group_id`: The group in which the message was sent.
   - `user_id`: User ID of the sender.
   - `message_content`: The content of the message.
   - `timestamp`: Timestamp indicating when the message was sent.

## Installation

1. Clone the repository: `git clone https://github.com/your/repository.git`
2. Change to the project directory: `cd Assignment-Submission-Alert-System`
3. Install dependencies: `npm install`
4. Configure the system settings and database credentials in `config.js`.
5. Start the application: `npm start`

## Usage

1. Access the system through the provided URL or by running the application locally.
2. Create an account or log in with existing credentials.
3. Subscribe to relevant assignment groups.
4. Receive notifications about new assignment submissions and updates.
5. Manage group membership and settings as needed.

## Contributing

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or feedback, please contact:

- BAHINDI EMMANUEL: [bahindiemmanuel20@gmail.com](mailto:bahindiemmanuel20@gmail.com)
- ECHERU RODNEY: [ivilleinc@gmail.com](mailto:ivilleinc@gmail.com)
- ZINDAZED: [zindazed@gmail.com](mailto:zindazed@gmail.com)
- AINEMBABAZI JESSE: [jessejeremy4@gmail.com](mailto:jessejeremy4@gmail.com)
- MULEKWA EMMANUEL: [emmamulekwa14@gmail.com](mailto:emmamulekwa14@gmail.com)

Feel free to reach out with any questions or suggestions!
