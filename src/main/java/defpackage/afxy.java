package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.Comparator;

/* renamed from: afxy */
final /* synthetic */ class afxy implements Comparator {
    public static final Comparator a = new afxy();

    private afxy() {
    }

    public final int compare(Object obj, Object obj2) {
        return (int) (((StatusBarNotification) obj).getPostTime() - ((StatusBarNotification) obj2).getPostTime());
    }
}
