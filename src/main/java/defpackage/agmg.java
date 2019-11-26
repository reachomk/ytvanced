package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor.AutoCloseInputStream;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: agmg */
public final class agmg implements agmo {
    private final Context a;
    private final Uri b;

    public agmg(Context context, Uri uri) {
        this.a = context;
        this.b = uri;
    }

    public final FileChannel a() {
        if (xvt.b(this.b)) {
            return new AutoCloseInputStream(ufq.a(this.a, this.b, "r")).getChannel();
        }
        if (xvt.a(this.b)) {
            String path = this.b.getPath();
            if (!TextUtils.isEmpty(path)) {
                return new agmi(new File(path)).a();
            }
            throw new IOException("URI path is null or empty.");
        }
        throw new IOException("Unsupported URI scheme to access YTB resource.");
    }
}
