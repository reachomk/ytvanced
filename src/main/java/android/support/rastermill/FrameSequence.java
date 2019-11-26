package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class FrameSequence {
    public final int mDefaultLoopCount;
    public final int mFrameCount;
    public final int mHeight;
    public final long mNativeFrameSequence;
    public final boolean mOpaque;
    public final int mWidth;

    class State {
        public long mNativeState;

        public State(long j) {
            this.mNativeState = j;
        }

        public void destroy() {
            long j = this.mNativeState;
            if (j != 0) {
                FrameSequence.nativeDestroyState(j);
                this.mNativeState = 0;
            }
        }

        public long getFrame(int i, Bitmap bitmap, int i2) {
            if (bitmap == null || bitmap.getConfig() != Config.ARGB_8888) {
                throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
            }
            long j = this.mNativeState;
            if (j != 0) {
                return FrameSequence.nativeGetFrame(j, i, bitmap, i2);
            }
            throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
        }
    }

    private static native long nativeCreateState(long j);

    private static native FrameSequence nativeDecodeByteArray(byte[] bArr, int i, int i2);

    private static native FrameSequence nativeDecodeByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native FrameSequence nativeDecodeStream(InputStream inputStream, byte[] bArr);

    private static native void nativeDestroyFrameSequence(long j);

    private static native void nativeDestroyState(long j);

    private static native long nativeGetFrame(long j, int i, Bitmap bitmap, int i2);

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public int getFrameCount() {
        return this.mFrameCount;
    }

    public int getDefaultLoopCount() {
        return this.mDefaultLoopCount;
    }

    private FrameSequence(long j, int i, int i2, boolean z, int i3, int i4) {
        this.mNativeFrameSequence = j;
        this.mWidth = i;
        this.mHeight = i2;
        this.mOpaque = z;
        this.mFrameCount = i3;
        this.mDefaultLoopCount = i4;
    }

    public static FrameSequence decodeByteArray(byte[] bArr) {
        return decodeByteArray(bArr, 0, bArr.length);
    }

    public static FrameSequence decodeByteArray(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        } else if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return nativeDecodeByteArray(bArr, i, i2);
        } else {
            throw new IllegalArgumentException("invalid offset/length parameters");
        }
    }

    public static FrameSequence decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        } else if (byteBuffer.isDirect()) {
            return nativeDecodeByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
        } else {
            if (byteBuffer.hasArray()) {
                return decodeByteArray(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
        }
    }

    public static FrameSequence decodeStream(InputStream inputStream) {
        if (inputStream != null) {
            return nativeDecodeStream(inputStream, new byte[16384]);
        }
        throw new IllegalArgumentException();
    }

    /* Access modifiers changed, original: 0000 */
    public State createState() {
        long j = this.mNativeFrameSequence;
        if (j != 0) {
            j = nativeCreateState(j);
            return j != 0 ? new State(j) : null;
        } else {
            throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            long j = this.mNativeFrameSequence;
            if (j != 0) {
                nativeDestroyFrameSequence(j);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    static {
        System.loadLibrary("framesequence");
    }
}
