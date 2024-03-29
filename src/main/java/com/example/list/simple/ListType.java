package com.example.list.simple;

public enum ListType {
    BASIC{
        @Override
        public String toString(){
            return "Basic";
        }
    }, CHECK{
        @Override
        public String toString() {
            return "Checklist";
        }
    }
}
