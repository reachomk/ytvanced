package defpackage;

import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

/* renamed from: uml */
public final class uml {
    public final anbi a;
    public final WritableByteChannel b = Channels.newChannel(this.a);

    public uml(OutputStream outputStream) {
        this.a = new anbi(outputStream);
    }

    public final uml a(ume ume) {
        ume.a().a(this.b);
        return this;
    }
}
