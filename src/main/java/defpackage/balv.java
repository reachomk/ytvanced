package defpackage;

import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: balv */
public final class balv extends balt {
    private final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");
    private Date b = new Date();

    public balv() {
        super("©day");
        this.a.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] a() {
        return ciq.a(balv.a(this.a.format(this.b)));
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(ByteBuffer byteBuffer) {
        try {
            this.b = this.a.parse(cio.a(byteBuffer, byteBuffer.remaining()).replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static String a(String str) {
        return str.replaceAll("\\+0000$", "Z");
    }

    /* Access modifiers changed, original: protected|final */
    public final int g() {
        return ciq.a(balv.a(this.a.format(this.b))).length;
    }
}
