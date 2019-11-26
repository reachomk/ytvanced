package defpackage;

import android.graphics.Bitmap;

/* renamed from: uor */
public final class uor implements Comparable {
    public final int a;
    private final uoq b;
    private Bitmap c;
    private int d = 1;

    public uor(uoq uoq, int i) {
        this.b = (uoq) uhy.a((Object) uoq);
        this.a = i;
    }

    public final long a() {
        return this.b.a().b(this.a);
    }

    public final synchronized Bitmap b() {
        return this.c;
    }

    public final synchronized void a(Bitmap bitmap) {
        uhy.a((Object) bitmap);
        if (e() != 3) {
            if (this.c == null) {
                this.c = bitmap;
                return;
            }
        }
        bitmap.recycle();
    }

    public final synchronized uor c() {
        uhy.b(this.d >= 0);
        int i = this.d;
        if (i <= 0) {
            return null;
        }
        this.d = i + 1;
        return this;
    }

    public final void d() {
        Object obj;
        synchronized (this) {
            obj = 1;
            uhy.b(this.d > 0);
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                Bitmap bitmap = this.c;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.c = null;
                }
            } else {
                obj = null;
            }
        }
        if (obj != null) {
            this.b.a(this);
        }
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Object[] objArr = new Object[2];
        int i = this.a;
        StringBuilder stringBuilder = new StringBuilder(22);
        stringBuilder.append("frameIndex=");
        stringBuilder.append(i);
        objArr[0] = stringBuilder.toString();
        i = e();
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DISPOSED" : "EXTRACTED" : "CREATED";
        StringBuilder stringBuilder2 = new StringBuilder(str.length() + 6);
        stringBuilder2.append("state=");
        stringBuilder2.append(str);
        objArr[1] = stringBuilder2.toString();
        return uhv.a(simpleName, objArr);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        uor uor = (uor) obj;
        int i = this.a;
        int i2 = uor.a;
        if (i < i2) {
            i2 = -1;
        } else if (i == i2) {
            return 0;
        } else {
            i2 = 1;
        }
        return i2;
    }

    public final synchronized int e() {
        int i;
        i = this.d != 0 ? this.c != null ? 2 : 1 : 3;
        return i;
    }
}
