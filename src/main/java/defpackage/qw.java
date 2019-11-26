package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: qw */
public final class qw implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    private qw(Context context) {
        this.b = context;
    }

    public static qw a(Context context) {
        return new qw(context);
    }

    public final qw a(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public final qw a(ComponentName componentName) {
        int size = this.a.size();
        try {
            Object a = qa.a(this.b, componentName);
            while (a != null) {
                this.a.add(size, a);
                a = qa.a(this.b, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final PendingIntent a() {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        ArrayList arrayList = this.a;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.b, 1, intentArr, 134217728, null);
    }
}
