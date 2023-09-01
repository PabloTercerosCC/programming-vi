from enum import Enum

class TaskActionFactory:
    def create_task_action(self, intent):
        if isinstance(intent, SpotifyIntent):
            return SpotifyTaskAction().handle_action(intent)
        elif isinstance(intent, ChatGPTIntent):
            return ChatGPTTaskAction().handle_action(intent)
        else:
            raise ValueError("Intent Not Found")
        
class SpotifyIntent(Enum):
    ACTION = "Get Albums"

class ChatGPTIntent(Enum):
    ACTION = "Ask Question"

class SpotifyTaskAction:
    def handle_action(self, intent):
        print(intent.value)

class ChatGPTTaskAction:
    def handle_action(self, intent):
        print(intent.value)
    

# Main
factory = TaskActionFactory()
spotify_intent = SpotifyIntent.ACTION
chatgpt_intent = ChatGPTIntent.ACTION

result = factory.create_task_action(chatgpt_intent)
