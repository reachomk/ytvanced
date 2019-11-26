package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: adbt */
public final class adbt {
    public static void a(Context context, Class cls, int i) {
        adbt.a(context, cls, i, null);
    }

    public static void a(Context context, Class cls, int i, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, cls);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            intent.putExtra("com.google.android.libraries.youtube.mdx.common.newIndex", i);
            intent.putExtra("com.google.android.libraries.youtube.mdx.common.data", bundle);
            context.startActivity(intent);
        }
    }
}
