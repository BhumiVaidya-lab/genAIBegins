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