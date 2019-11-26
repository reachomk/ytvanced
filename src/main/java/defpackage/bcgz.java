package defpackage;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bcgz */
public final class bcgz {
    private final umc a;
    private MediaFormat b;
    private MediaFormat c;
    private int d;
    private int e;
    private ByteBuffer f;
    private final List g = new ArrayList();
    private boolean h;

    public bcgz(umc umc) {
        this.a = umc;
    }

    /* Access modifiers changed, original: final */
    public final void a(bchb bchb, MediaFormat mediaFormat) {
        int ordinal = bchb.ordinal();
        if (ordinal == 0) {
            this.b = mediaFormat;
        } else if (ordinal == 1) {
            this.c = mediaFormat;
        } else {
            throw new AssertionError();
        }
        MediaFormat mediaFormat2 = this.b;
        if (mediaFormat2 != null && this.c != null) {
            this.d = this.a.a(mediaFormat2);
            String str = "mime";
            String.valueOf(this.b.getString(str)).length();
            this.e = this.a.a(this.c);
            String.valueOf(this.c.getString(str)).length();
            this.a.a();
            this.h = true;
            int i = 0;
            if (this.f == null) {
                this.f = ByteBuffer.allocate(0);
            }
            this.f.flip();
            this.g.size();
            this.f.limit();
            BufferInfo bufferInfo = new BufferInfo();
            for (bchc bchc : this.g) {
                bufferInfo.set(i, bchc.b, bchc.c, bchc.d);
                this.a.a(a(bchc.a), this.f, bufferInfo);
                i += bchc.b;
            }
            this.g.clear();
            this.f = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bchb bchb, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (this.h) {
            this.a.a(a(bchb), byteBuffer, bufferInfo);
            return;
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        if (this.f == null) {
            this.f = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
        }
        this.f.put(byteBuffer);
        this.g.add(new bchc(bchb, bufferInfo.size, bufferInfo));
    }

    private final int a(bchb bchb) {
        int ordinal = bchb.ordinal();
        if (ordinal == 0) {
            return this.d;
        }
        if (ordinal == 1) {
            return this.e;
        }
        throw new AssertionError();
    }
}
