package defpackage;

import java.io.IOException;

/* renamed from: afah */
class afah implements ofy {
    public ofy a = new ofn();
    private Exception b;

    afah() {
    }

    public final void a(Exception exception) {
        boolean z = true;
        if (!((exception instanceof IOException) || (exception instanceof InterruptedException))) {
            z = false;
        }
        amqw.a(z);
        this.b = exception;
    }

    public final int a(ofp ofp, int i, boolean z) {
        Exception exception = this.b;
        if (exception != null) {
            this.b = null;
            if (exception instanceof IOException) {
                throw ((IOException) exception);
            } else if (exception instanceof InterruptedException) {
                throw ((InterruptedException) exception);
            }
        }
        return this.a.a(ofp, i, z);
    }

    public final void a(nzw nzw) {
        this.a.a(nzw);
    }

    public void a(oza oza, int i) {
        this.a.a(oza, i);
    }

    public void a(long j, int i, int i2, int i3, ogb ogb) {
        this.a.a(j, i, i2, i3, ogb);
    }
}
