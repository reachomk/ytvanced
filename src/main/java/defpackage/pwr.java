package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: pwr */
public final class pwr extends nf implements puf {
    public static WeakHashMap a = new WeakHashMap();
    private final Map Z = new zj();
    public int b = 0;
    public Bundle c;

    public final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.Z.get(str));
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.Z.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.Z.put(str, lifecycleCallback);
        if (this.b > 0) {
            new Handler(Looper.getMainLooper()).post(new pwq(this, lifecycleCallback, str));
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.b = 1;
        this.c = bundle;
        for (Entry entry : this.Z.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void W_() {
        super.W_();
        this.b = 2;
        for (LifecycleCallback b : this.Z.values()) {
            b.b();
        }
    }

    public final void B() {
        super.B();
        this.b = 3;
        for (LifecycleCallback c : this.Z.values()) {
            c.c();
        }
    }

    public final void a(int i, int i2, Intent intent) {
        for (LifecycleCallback a : this.Z.values()) {
            a.a(i, i2, intent);
        }
    }

    public final void e(Bundle bundle) {
        if (bundle != null) {
            for (Entry entry : this.Z.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void N_() {
        super.N_();
        this.b = 4;
        for (LifecycleCallback d : this.Z.values()) {
            d.d();
        }
    }

    public final void X_() {
        super.X_();
        this.b = 5;
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.Z.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ Activity a() {
        return p();
    }
}
