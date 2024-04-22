package com.example.listig.lists;

public enum ListRole {
    OWNER {
        @Override
        public String toString() {
            return "Owner";
        }
    },
    EDITOR {
        @Override
        public String toString() {
            return "Editor";
        }
    },
    VIEWER {
        @Override
        public String toString() {
            return "Viewer";
        }
    }
}
