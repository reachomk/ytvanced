package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;

/* renamed from: dwo */
public final class dwo {
    public final Context a;
    public final Resources b;
    public final akkq c;
    public final NotificationManager d;
    public final zzl e;
    public int f;
    public String g;
    public volatile String h;
    public qg i;
    public qg j;
    public boolean k = false;

    public dwo(Context context, akkq akkq, zzl zzl) {
        this.a = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        this.e = zzl;
        this.b = context.getResources();
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final void a() {
        this.d.cancel(1005);
        this.k = false;
    }
}
