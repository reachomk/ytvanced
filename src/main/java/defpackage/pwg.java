package defpackage;

import android.app.Activity;
import android.app.Fragment;
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

/* renamed from: pwg */
public final class pwg extends Fragment implements puf {
    public static WeakHashMap a = new WeakHashMap();
    public int b = 0;
    public Bundle c;
    private final Map d = new zj();

    public final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d.get(str));
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.d.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.d.put(str, lifecycleCallback);
        if (this.b > 0) {
            new Handler(Looper.getMainLooper()).post(new pwj(this, lifecycleCallback, str));
        }
    }

    public final Activity a() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = 1;
        this.c = bundle;
        for (Entry entry : this.d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.b = 2;
        for (LifecycleCallback b : this.d.values()) {
            b.b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.b = 3;
        for (LifecycleCallback c : this.d.values()) {
            c.c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.d.values()) {
            a.a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.d.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.b = 4;
        for (LifecycleCallback d : this.d.values()) {
            d.d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b = 5;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.d.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
