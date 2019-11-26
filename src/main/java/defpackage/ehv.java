package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;

/* renamed from: ehv */
public final class ehv extends akkc {
    public ehv(Context context) {
        super(context);
    }

    public final Drawable a(byte[] bArr) {
        int length = bArr.length;
        if ((length >= 21 && bArr[0] == (byte) 82 && bArr[1] == (byte) 73 && bArr[2] == (byte) 70 && bArr[3] == (byte) 70 && bArr[8] == (byte) 87 && bArr[9] == (byte) 69 && bArr[10] == (byte) 66 && bArr[11] == (byte) 80 && bArr[12] == (byte) 86 && bArr[13] == (byte) 80 && bArr[14] == (byte) 56 && bArr[15] == (byte) 88 && (bArr[20] & 2) != 0) || (length >= 3 && bArr[0] == (byte) 71 && bArr[1] == (byte) 73 && bArr[2] == (byte) 70)) {
            FrameSequence frameSequence = null;
            try {
                frameSequence = FrameSequence.decodeByteArray(bArr);
            } catch (IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
                stringBuilder.append("Error decoding GIF or WebP. ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
            } catch (UnsatisfiedLinkError unused) {
                xtl.c("Error loading rastermill native library.");
            }
            if (frameSequence != null) {
                FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(frameSequence);
                frameSequenceDrawable.setLoopBehavior(2);
                return frameSequenceDrawable;
            }
        }
        return b(bArr);
    }
}
