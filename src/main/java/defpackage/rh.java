package defpackage;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: rh */
public class rh {
    public int c;
    public rg d;
    public final Context e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public boolean i = false;
    public boolean j = false;

    public rh(Context context) {
        this.e = context.getApplicationContext();
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    public void a(Object obj) {
        throw null;
    }

    public boolean b() {
        return false;
    }

    public void e() {
    }

    public void f() {
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        Class cls = getClass();
        stringBuilder.append(cls.getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(cls)));
        stringBuilder.append(" id=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.c);
        printWriter.print(" mListener=");
        printWriter.println(this.d);
        if (this.f || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.i);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.g);
            printWriter.print(" mReset=");
            printWriter.println(this.h);
        }
    }
}
