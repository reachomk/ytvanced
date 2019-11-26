package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tv */
public abstract class tv extends Service {
    public ud a;
    public final ub b = new ub(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList c = new ArrayList();
    public final zj d = new zj();
    public ub e;
    public final vf f = new vf(this);
    public xo g;

    public abstract ty a();

    public abstract void a(ur urVar);

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 28) {
            this.a = new um(this);
        } else if (VERSION.SDK_INT >= 26) {
            this.a = new ul(this);
        } else if (VERSION.SDK_INT >= 23) {
            this.a = new ug(this);
        } else if (VERSION.SDK_INT >= 21) {
            this.a = new uc(this);
        } else {
            this.a = new up(this);
        }
        this.a.a();
    }

    public final IBinder onBind(Intent intent) {
        return this.a.a(intent);
    }

    public final void b(ur urVar) {
        urVar.e = 1;
        a(urVar);
    }

    public static void c(ur urVar) {
        urVar.e = 2;
        urVar.b(null);
    }

    static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 <= 0 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }
}
