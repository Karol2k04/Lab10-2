package org.example;

    import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

    class CastMember {
        private String actorName;
        private String characterName;

        public CastMember(String actorName, String characterName) {
            this.actorName = actorName;
            this.characterName = characterName;
        }

        // Getters and setters (if needed)
        public String getActorName() {
            return actorName;
        }

        public String getCharacterName() {
            return characterName;
        }
    }

