package com.epam.engx.cleancode.naming.task1;


import com.epam.engx.cleancode.naming.task1.thirdpartyjar.CollectionService;
import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Message;
import com.epam.engx.cleancode.naming.task1.thirdpartyjar.NotificationManager;
import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Order;

public class CollectOrderService implements OrderService {

    private CollectionService collectionService;
    private NotificationManager notificationManagerService;
    private static int INFO_NOTIFICATION_LEVEL=4;
	private static int CRITICAL_NOTIFICATION_LEVEL=1;
    public void submitOrder(Order order) {
        if (collectionService.isEligibleForCollection(order))
            notificationManagerService.notifyCustomer(Message.READY_FOR_COLLECT, INFO_NOTIFICATION_LEVEL);
        else
            notificationManagerService.notifyCustomer(Message.IMPOSSIBLE_TO_COLLECT, CRITICAL_NOTIFICATION_LEVEL);
    }

    public void setCollectionService(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    public void setNotificationManagerService(NotificationManager notificationManagerService) {
        this.notificationManagerService = notificationManagerService;
    }
}
