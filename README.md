task 5- https://git.epam.com/epm-cdp/global-java-foundation-program/java-courses/-/blob/main/gen-ai-bootcamp/materials/05-embedding/02_task.md
Evaluation Criteria:

Configuration for Vector Database - Done


Correctly configured the application to use a vector database (e.g., Qdrant with qdrant plugin or you can use any other Vector DB) (15%)


Build Embedding from Text - Done


Implemented an endpoint to build an embedding from the provided text (15%)


Build and Store Embedding from Text - Done


Implemented an endpoint to build and store an embedding from the provided text (15%)


Search for Closest Embeddings - Done


Implemented an endpoint to search for the closest embeddings in the database based on the input text (25%)


Functionality Testing - Done


Application runs without errors (15%)
Responses are generated correctly and are relevant to the prompts (15%)

Evidences - Create collection -
![image](https://github.com/user-attachments/assets/7ca7a6df-1871-4905-964c-48ddc45ca6e1)

![image](https://github.com/user-attachments/assets/e99689d4-31ab-4f55-b32b-5738abd9a6dc)
embedding endpoints:
![image](https://github.com/user-attachments/assets/4900f80c-28ee-4205-acd7-d9463ffee8ef)
build text embeddings
![image](https://github.com/user-attachments/assets/4210b665-f7b1-4036-9072-3736516d2a2a)
build and store vectors
![image](https://github.com/user-attachments/assets/6d010487-24c1-4181-b347-9b012908fa15)
![image](https://github.com/user-attachments/assets/58ee7f9e-6442-46ac-b454-08778a0da1a8)





































# genAIBegins
Use with chat history:

First API call curl:

curl --location 'localhost:8080/azure/ai/query?input=hi, I like comedy movies. I would like two suggestions' \

Response:

Sure! Here are two comedy movie suggestions for you:

1. "Superbad" (2007) - This coming-of-age comedy follows two high school friends who embark on a wild adventure to buy alcohol for a party, with plenty of hilarious misadventures along the way.

2. "The Hangover" (2009) - This raucous comedy follows a group of friends who wake up in Las Vegas with no memory of the previous night and must piece together their wild antics in order to find their missing friend.

curl --location 'localhost:8080/azure/ai/query?input=can you suggest me two more'

Response for second API:

1. The Great Gatsby by F. Scott Fitzgerald

2. To Kill a Mockingbird by Harper Lee

API call with low temperature:

curl --location 'localhost:8080/azure/ai/store' \

{
"prompt": "Hey,what is your favorite season ? tell me why is it.?",
"temperature": 0.2,
"maxTokens": 1000,
"stopSequences": [
]
}

Response:

AI answer : My favorite season is autumn. I love the cool, crisp air, 
the beautiful changing colors of the leaves, and the cozy feeling of wearing sweaters and drinking hot drinks. 
I also enjoy the harvest festivals and the abundance of seasonal fruits and vegetables. Overall, autumn just has a magical 
and nostalgic feeling that I find very comforting and inspiring.


{
"prompt": "Hey,what is your favorite season ? tell me why is it.?",
"temperature": 1.0,
"maxTokens": 4096,
"stopSequences": [
]
}

Response
AI answer : My favorite season is fall because I love the cooler weather, the changing colors of the leaves, 
and all of the fun activities that come with it, like apple picking and pumpkin carving. 
It's such a cozy and comforting time of year.

Task 3

API call with with different model:

curl --location localhost:8080/init-chat

{
"prompt": "Can you help me to write patriotic poem",
"temperature": 0.9,
"deploymentName": "Mixtral-8x7B-Instruct-v0.1"
}

Response
userPrompt:	Can you help me to write patriotic poem
aiResponse:	I pledge allegiance to this land, Where freedom and justice go hand in hand. From sea to shining sea, 
we stand united, In times of challenge, we are undivided. Our flag waves proudly in the breeze, A symbol of the land of the free. 
We honor those who fought and bled, To protect the ideals upon which this nation was led. From our founding fathers to present day, 
We strive to uphold the values they portrayed. Equality, liberty, and democracy, Are the pillars of our great country. 
So let us stand tall and true, In honor of the red, white, and blue. For America, the land we love, We will always rise above.

{
"prompt": "Can you help me to write patriotic poem",
"temperature": 0.9,
"deploymentName": "chat-bison"
}

userPrompt:	Can you help me to write patriotic poem
aiResponse:	Of course, here is a patriotic poem for you: In the land of the free, and the home of the brave, Our flag still waves,
as our nation we save. From the mountains to the seas, Our country stands strong, united as one. We honor those who came before, 
Who fought and died to protect our shore. They gave their all, without hesitation, To ensure our freedom, our great nation. 
So let us stand tall, with pride and respect, For the red, white, and blue, we will never neglect. United we stand, in liberty and
justice for all, America the beautiful, stand proud and tall.
