package Components;

import org.springframework.stereotype.Component;

@Component
public class Youtube implements Channel{
        private String name = "Youtube";
        private String language = "english";

        @Override
        public String loadChannel() {
            return name;
        }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }
}
