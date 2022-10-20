package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.dto.CommentDto;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.dto.ItemDtoWithBookingsAndComments;

import java.util.List;

public interface ItemService {
    ItemDto createItem(Long id, ItemDto itemDto);

    ItemDto getItem(Long id);

    ItemDtoWithBookingsAndComments getItemDtoWithBookingsAndComments(Long userId, Long itemId);

    List<ItemDtoWithBookingsAndComments> getAllItemsByUserId(Long userId);

    ItemDto updateItem(Long ownerId, Long itemId, ItemDto itemDto);

    void deleteItem(Long ownerId, Long itemId);

    List<ItemDto> searchItems(String text);

    CommentDto addComment(Long authorId, Long itemId, CommentDto commentDto);
}
