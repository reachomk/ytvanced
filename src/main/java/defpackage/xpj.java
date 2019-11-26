package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: xpj */
public final class xpj extends xpk {
    private boolean a = true;
    private RenderScript b;

    public final Bitmap a(Context context, Bitmap bitmap) {
        if (this.a) {
            try {
                Bitmap copy;
                if (this.b == null) {
                    this.b = RenderScript.create(context);
                }
                if (bitmap.getConfig() != Config.ARGB_8888) {
                    copy = bitmap.copy(Config.ARGB_8888, false);
                    if (copy == null) {
                        return bitmap;
                    }
                } else {
                    copy = bitmap;
                }
                Bitmap copy2 = copy.copy(copy.getConfig(), true);
                Allocation createFromBitmap = Allocation.createFromBitmap(this.b, copy);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(this.b, copy2);
                RenderScript renderScript = this.b;
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                create.setRadius(10.0f);
                create.setInput(createFromBitmap);
                create.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(copy2);
                create.destroy();
                return copy2;
            } catch (RSRuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
                stringBuilder.append("RenderScript blur failed: ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
                this.a = false;
            }
        }
        return bitmap;
    }
}
