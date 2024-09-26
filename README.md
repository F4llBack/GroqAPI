# GroqAPI for Java

A straightforward Java interface for the Groq API.
NOTE: THIS IS A COMMUNITY MAINTAINED PROJECT

## Table of Contents

- [Installation](#installation)
    - [Getting Text](#getting-text)
    - [System instructions](#system-instructions)
    - [GroqResponse](#groqresponse)
    - [Available Information](#available-information)
- [Usage](#usage)
- [Recent Changes](#recent-changes)
- [License](#license)
- [Tested Gson versions](#tested-gson-versions)
- [Contributing](#contributing)
- [Contact](#contact)

## Installation

1. **Download the JAR:**
   - Go to the [Releases](https://github.com/yourusername/groq-api-client/releases) page of this repository.
   - Download the latest JAR file.

2. **Add the JAR to Your Project:**
   - If you are using an IDE, you can usually add the JAR file to your project by right-clicking on your project folder, selecting `Properties` or `Build Path`, and then adding the JAR file under `Libraries`.
   - Alternatively, if you are using a build tool like Maven or Gradle, you can place the JAR file in a suitable directory and include it in your project's build configuration.

3. **Download [Google Gson](https://github.com/jgravelle/GroqApiLibrary) (Skip this if you are using maven)**
4. **Add Gson to Your Project**

## Usage
### Getting Text
*This does not contain System instructions for that visit [System instructions](#system-instructions)*
While getting a response in plain text can be useful in some cases, it only provides the first answer choice, which might not always be usefull. Therefore, it's generally more convenient to use the `createChatCompletion` method instead of `createChatCompletionText`. For more information on this Topic visit [GroqResponse](#groqresponse)

```java
// Creating an instance of Groq using the default Model which is Llama3_8b
Groq groq = new Groq(apiKey, Model.DEFAULT);

// Creating a Prompt
Message prompt = new Message(Role.User, "How old is the universe?");

// Getting a Response in plain Text
String response = groq.createChatCompletionText(prompt);

System.out.println(response);
```

### System instructions
If you need to give more information to the System how to handle/respond to a prompt you can use system instructions.
```java
// Creating an instance of Groq using the default Model which is Llama3_8b
Groq groq = new Groq(apiKey, Model.DEFAULT);

// Creating custom instructions that tell the System how to behave
Message instruction = new Message(Role.System, "You can only speak German from now on");

// Creating the Prompt
Message prompt = new Message(Role.User, "How old is the universe?");

// Getting a Response adujst as needed (see GroqResponse)
String response = groq.createChatCompletionText(instruction, prompt);

System.out.println(response);
```

### GroqResponse
The GroqResponse gives you access to every single information the Api Endpoint gave back.
The same Rules for custom instructions as for `createChatCompletionText` apply to `createChatCompletion`.

```java
// Creating an instance of Groq using the default Model which is Llama3_8b
Groq groq = new Groq(apiKey, Model.DEFAULT);

// Creating custom instructions that tell the System how to behave
Message instruction = new Message(Role.System, "You can only speak German from now on");

// Creating the Prompt
Message prompt = new Message(Role.User, "How old is the universe?");

// Getting a GroqResponse
GroqResponse response = groq.createChatCompletion(instruction, prompt);

// Accessing information (see Available Information) 
System.out.println(response.getChoices().get(0).getFinishReason());
```

## Available Information

`GroqResponse.java`
| Field name         | Type         |
|--------------------|--------------|
| id                 | String       |
| object             | String       |
| created            | int          |
| model              | String       |
| choices            | List<Choice> |
| usage              | Usage        |
| system_fingerprint | String       |
| x_groq             | XGroq        |


`Choice.java`
| Field name         | Type            |
|--------------------|--------------   |
| index              | int             |
| message            | ResponseMessage |
| logprobs           | Object          |
| finish_reason      | String          |



`Message.java`
| Field name         | Type            |
|--------------------|--------------   |
| role               | String          |
| content            | String          |


`Usage.java`
| Field name         | Type            |
|--------------------|--------------   |
| prompt_tokens      | int             |
| prompt_time        | double          |
| completion_tokens  | int             |
| completion_time    | double          |
| total_tokens       | int             |
| total_time         | double          |


`XGroq.java`
| Field name         | Type            |
|--------------------|--------------   |
| id                 | String          |



## Recent Changes
**Documentation**:
- Updated API Documentation to fit the latest changes
- Added Contrebutions and Contact
- Removed unused table of content stuff and added tested Gson versions

**Api**:
- Fixed Message taking a Role in constructor but not in setter and Message not returning a Role
- Removed Duplicated Message Doc update soon
- Updated Readme and deleted unused gson library
- Refactor createChatCompletionText for more simplicity
- Refactor createChatCompletion for more simplicity
- Moved my old project file to my new Repository

## License

This project is licensed under a [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International (CC BY-NC-SA 4.0)](https://creativecommons.org/licenses/by-nc-sa/4.0/) License.

### You are free to:
- **Share** — copy and redistribute the material in any medium or format
- **Adapt** — remix, transform, and build upon the material

### Under the following terms:
- **Attribution** — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
- **NonCommercial** — You may not use the material for commercial purposes.
- **ShareAlike** — If you remix, transform, or build upon the material, you must distribute your contributions under the same license as the original.

### Notices:
- You do not have to comply with the license for elements of the material in the public domain or where your use is permitted by an applicable exception or limitation.
- No warranties are given. The license may not give you all of the permissions necessary for your intended use. For example, other rights such as publicity, privacy, or moral rights may limit how you use the material.

---

**Summary:**
- **BY**: Credit must be given to you, the creator.
- **NC**: Only noncommercial use of your work is permitted. Noncommercial means not primarily intended for or directed towards commercial advantage or monetary compensation.
- **SA**: Adaptations must be shared under the same terms.

See [LICENSE](https://github.com/F4llBack/GroqAPI?tab=License-1-ov-file) for more information.

## Tested Gson versions
- Used to make the API: 2.11.0
- Tested: 2.2.4 (Works fine)

## Contributing
If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## Contact
If you want to contact me feel free to write an email to waldoontop@gmail.com!
