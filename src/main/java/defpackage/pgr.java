package defpackage;

import android.net.Uri.Builder;
import android.util.LogPrinter;

/* renamed from: pgr */
public final class pgr {
    public pgr() {
        LogPrinter logPrinter = new LogPrinter(4, "GA/LogCatTransport");
    }

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        builder.build();
    }
}
