package defpackage;

import java.nio.channels.Channels;

/* renamed from: bcob */
final class bcob implements bcnw {
    public final /* synthetic */ bcnx a;

    bcob(bcnx bcnx) {
        this.a = bcnx;
    }

    public final void a() {
        bcnx bcnx = this.a;
        if (bcnx.c == null) {
            bcnx.i.l = 10;
            this.a.b.connect();
            this.a.i.l = 12;
            bcnx = this.a;
            bcnx.d = bcnx.b.getOutputStream();
            bcnx = this.a;
            bcnx.c = Channels.newChannel(bcnx.d);
        }
        this.a.a.set(Integer.valueOf(0));
        this.a.a(new bcoe(this));
    }
}
