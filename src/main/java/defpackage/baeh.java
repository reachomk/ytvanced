package defpackage;

import com.google.vr.sdk.audio.GvrAudioSurround;
import java.nio.ByteBuffer;

/* renamed from: baeh */
public final class baeh implements baef {
    private final GvrAudioSurround a;
    private final int b;
    private final baeu c;
    private final float[] d;

    public baeh(int i, int i2, int i3, baeu baeu, int i4) {
        boolean z = false;
        baet.a(i > 0);
        if (i2 > 0) {
            z = true;
        }
        baet.a(z);
        baet.a(true);
        if (baet.b(i3)) {
            this.b = i2;
            this.d = new float[4];
            this.c = (baeu) baet.a((Object) baeu);
            this.a = new GvrAudioSurround(i4, i, i3, 1024);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Number of input channels (");
        stringBuilder.append(i3);
        stringBuilder.append(") is not supported");
        throw new baek(stringBuilder.toString());
    }

    public final int a() {
        return this.b;
    }

    public final boolean a(ByteBuffer byteBuffer) {
        c();
        byteBuffer.position(byteBuffer.position() + this.a.addInput(byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
        return byteBuffer.hasRemaining() ^ 1;
    }

    public final boolean b(ByteBuffer byteBuffer) {
        c();
        byteBuffer.position(byteBuffer.position() + this.a.getOutput(byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
        if (byteBuffer.hasRemaining()) {
            return false;
        }
        byteBuffer.flip();
        return true;
    }

    public final void b() {
        this.a.flush();
    }

    private final void c() {
        this.c.a(this.d);
        GvrAudioSurround gvrAudioSurround = this.a;
        float[] fArr = this.d;
        gvrAudioSurround.updateNativeOrientation(fArr[3], fArr[0], fArr[1], fArr[2]);
    }
}
