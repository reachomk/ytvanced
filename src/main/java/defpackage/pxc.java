package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: pxc */
public final class pxc extends pxh {
    public final SparseArray b = new SparseArray();

    public pxc(puf puf) {
        super(puf);
        this.a.a("AutoManageHelper", (LifecycleCallback) this);
    }

    public final void b() {
        super.b();
        boolean z = this.d;
        String.valueOf(this.b).length();
        if (this.e.get() == null) {
            for (int i = 0; i < this.b.size(); i++) {
                pxf a = a(i);
                if (a != null) {
                    a.b.c();
                }
            }
        }
    }

    public final void d() {
        super.d();
        for (int i = 0; i < this.b.size(); i++) {
            pxf a = a(i);
            if (a != null) {
                a.b.e();
            }
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.b.size(); i++) {
            pxf a = a(i);
            if (a != null) {
                printWriter.append(str).append("GoogleApiClient #").print(a.a);
                printWriter.println(":");
                a.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(psa psa, int i) {
        String str = "AutoManageHelper";
        Log.w(str, "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf(str, "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        if (((pxf) this.b.get(i)) != null) {
            pth pth = (pxf) this.b.get(i);
            this.b.remove(i);
            if (pth != null) {
                pth.b.a(pth);
                pth.b.e();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        for (int i = 0; i < this.b.size(); i++) {
            pxf a = a(i);
            if (a != null) {
                a.b.c();
            }
        }
    }

    private final pxf a(int i) {
        if (this.b.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.b;
        return (pxf) sparseArray.get(sparseArray.keyAt(i));
    }
}
