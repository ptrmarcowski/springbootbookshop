package com.marcowski.springbootbookshop.service;

import com.marcowski.springbootbookshop.model.PurchaseHistory;
import com.marcowski.springbootbookshop.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {

    PurchaseHistory save(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
