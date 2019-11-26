package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import java.util.UUID;

/* renamed from: zkx */
final class zkx extends AsyncTask {
    private final zjj a;
    private final zkv b;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((zme) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 4);
        stringBuilder.append(valueOf);
        stringBuilder.append(".png");
        valueOf = stringBuilder.toString();
        xln xln = new xln();
        bitmap.compress(CompressFormat.PNG, 100, xln);
        bitmap.recycle();
        this.a.a(valueOf, xln.toByteArray());
        zmd zmd = (zmd) zme.e.createBuilder();
        valueOf = zjz.b(valueOf);
        zmd.copyOnWrite();
        zme zme = (zme) zmd.instance;
        if (valueOf != null) {
            zme.a |= 1;
            zme.b = valueOf;
            int width = bitmap.getWidth();
            zmd.copyOnWrite();
            zme = (zme) zmd.instance;
            zme.a |= 2;
            zme.c = width;
            int height = bitmap.getHeight();
            zmd.copyOnWrite();
            zme zme2 = (zme) zmd.instance;
            zme2.a |= 4;
            zme2.d = height;
            return (zme) ((anxl) zmd.build());
        }
        throw new NullPointerException();
    }

    /* synthetic */ zkx(zjj zjj, zkv zkv) {
        this.a = zjj;
        this.b = zkv;
    }
}
