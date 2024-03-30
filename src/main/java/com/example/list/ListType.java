package com.example.list;

public enum ListType {
    BASIC{
        @Override
        public String toString(){
            return "Basic";
        }
        public String description(){
            return "Basic";
        }
    }, CHECK{
        @Override
        public String toString() {
            return "Check";
        }
        public String description(){
            return "Checklist";
        }
    }
}
