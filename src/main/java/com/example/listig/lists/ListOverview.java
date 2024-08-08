package com.example.listig.lists;

public record ListOverview(Long id, String name, String desc, String owner, int users, ListType type) {
}
