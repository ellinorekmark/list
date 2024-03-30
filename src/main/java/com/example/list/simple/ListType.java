package com.example.list.simple;

public enum ListType {
    BASIC{
        @Override
        public String toString(){
            return "Basic";
        }
        public String fancyName(){
            return "Basic";
        }
    }, CHECK{
        @Override
        public String toString() {
            return "Check";
        }
        public String fancyName(){
            return "Checklist";
        }
    }
}
