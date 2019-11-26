package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: qy */
public abstract class qy extends rh {
    public volatile rb a;
    public long b = -10000;
    private Executor k;
    private volatile rb l;

    public qy(Context context) {
        super(context);
    }

    public abstract Object d();

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        b();
        this.a = new rb(this);
        c();
    }

    public final boolean b() {
        if (this.a == null) {
            return false;
        }
        if (!this.f) {
            this.i = true;
        }
        rb rbVar;
        if (this.l != null) {
            rbVar = this.a;
            this.a = null;
            return false;
        }
        rbVar = this.a;
        rbVar = this.a;
        rbVar.c.set(true);
        boolean cancel = rbVar.b.cancel(false);
        if (cancel) {
            this.l = this.a;
        }
        this.a = null;
        return cancel;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (this.l == null && this.a != null) {
            rb rbVar = this.a;
            if (this.k == null) {
                this.k = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            rbVar = this.a;
            Executor executor = this.k;
            if (rbVar.e != 1) {
                int i = rbVar.e;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (i2 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            }
            rbVar.e = 2;
            executor.execute(rbVar.b);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(rb rbVar) {
        if (this.l == rbVar) {
            this.b = SystemClock.uptimeMillis();
            this.l = null;
            c();
        }
    }

    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(str2);
            rb rbVar = this.a;
            printWriter.println(false);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(str2);
            rb rbVar2 = this.l;
            printWriter.println(false);
        }
    }
}
