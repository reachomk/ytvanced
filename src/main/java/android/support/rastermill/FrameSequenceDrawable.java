package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;

public class FrameSequenceDrawable extends Drawable implements Animatable, Runnable {
    public static final long DEFAULT_DELAY_MS = 100;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_FINITE = 1;
    public static final int LOOP_INF = 2;
    @Deprecated
    public static final int LOOP_ONCE = 1;
    public static final long MIN_DELAY_MS = 20;
    public static final int STATE_DECODING = 2;
    public static final int STATE_READY_TO_SWAP = 4;
    public static final int STATE_SCHEDULED = 1;
    public static final int STATE_WAITING_TO_SWAP = 3;
    public static final String TAG = "FrameSequence";
    public static BitmapProvider sAllocatingBitmapProvider = new BitmapProvider() {
        public void releaseBitmap(Bitmap bitmap) {
        }

        public Bitmap acquireBitmap(int i, int i2) {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
    };
    public static HandlerThread sDecodingThread;
    public static Handler sDecodingThreadHandler;
    public static final Object sLock = new Object();
    public static final Handler sMainHandler = new Handler(Looper.getMainLooper());
    public Bitmap mBackBitmap;
    public BitmapShader mBackBitmapShader;
    public final BitmapProvider mBitmapProvider;
    public boolean mCircleMaskEnabled;
    public int mCurrentLoop;
    public final Runnable mDecodeRunnable;
    public boolean mDestroyed;
    public final Runnable mFinishedCallbackRunnable;
    public final FrameSequence mFrameSequence;
    public final State mFrameSequenceState;
    public Bitmap mFrontBitmap;
    public BitmapShader mFrontBitmapShader;
    public long mLastSwap;
    public final Object mLock;
    public int mLoopBehavior;
    public int mLoopCount;
    public int mNextFrameToDecode;
    public long mNextSwap;
    public OnFinishedListener mOnFinishedListener;
    public final Paint mPaint;
    public final Rect mSrcRect;
    public int mState;
    public final RectF mTempRectF;
    public final Runnable mUiScheduleRunnable;

    public interface BitmapProvider {
        Bitmap acquireBitmap(int i, int i2);

        void releaseBitmap(Bitmap bitmap);
    }

    public interface OnFinishedListener {
        void onFinished(FrameSequenceDrawable frameSequenceDrawable);
    }

    private static void initializeDecodingThread() {
        synchronized (sLock) {
            if (sDecodingThread != null) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("FrameSequence decoding thread", 10);
            sDecodingThread = handlerThread;
            handlerThread.start();
            sDecodingThreadHandler = new Handler(sDecodingThread.getLooper());
        }
    }

    public void setOnFinishedListener(OnFinishedListener onFinishedListener) {
        this.mOnFinishedListener = onFinishedListener;
    }

    public void setLoopBehavior(int i) {
        this.mLoopBehavior = i;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    private static Bitmap acquireAndValidateBitmap(BitmapProvider bitmapProvider, int i, int i2) {
        Bitmap acquireBitmap = bitmapProvider.acquireBitmap(i, i2);
        if (acquireBitmap.getWidth() >= i && acquireBitmap.getHeight() >= i2 && acquireBitmap.getConfig() == Config.ARGB_8888) {
            return acquireBitmap;
        }
        throw new IllegalArgumentException("Invalid bitmap provided");
    }

    public FrameSequenceDrawable(FrameSequence frameSequence) {
        this(frameSequence, sAllocatingBitmapProvider);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, BitmapProvider bitmapProvider) {
        this.mLock = new Object();
        this.mDestroyed = false;
        this.mLoopBehavior = 3;
        this.mLoopCount = 1;
        this.mTempRectF = new RectF();
        this.mDecodeRunnable = new Runnable() {
            /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            r5 = null;
     */
            /* JADX WARNING: Missing block: B:15:?, code skipped:
            r0 = android.support.rastermill.FrameSequenceDrawable.access$500(r11.this$0).getFrame(r1, r2, r1 - 2);
     */
            /* JADX WARNING: Missing block: B:16:0x0036, code skipped:
            r2 = null;
     */
            /* JADX WARNING: Missing block: B:17:0x0038, code skipped:
            r0 = move-exception;
     */
            /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            r0 = java.lang.String.valueOf(r0);
            r2 = new java.lang.StringBuilder(r0.length() + 25);
            r2.append("exception during decode: ");
            r2.append(r0);
            android.util.Log.e(android.support.rastermill.FrameSequenceDrawable.TAG, r2.toString());
            r0 = 0;
            r2 = 1;
     */
            public void run() {
                /*
                r11 = this;
                r0 = android.support.rastermill.FrameSequenceDrawable.this;
                r0 = r0.mLock;
                monitor-enter(r0);
                r1 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00cb }
                r1 = r1.mDestroyed;	 Catch:{ all -> 0x00cb }
                if (r1 == 0) goto L_0x0011;
            L_0x000f:
                monitor-exit(r0);	 Catch:{ all -> 0x00cb }
                return;
            L_0x0011:
                r1 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00cb }
                r1 = r1.mNextFrameToDecode;	 Catch:{ all -> 0x00cb }
                if (r1 >= 0) goto L_0x001b;
            L_0x0019:
                monitor-exit(r0);	 Catch:{ all -> 0x00cb }
                return;
            L_0x001b:
                r2 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00cb }
                r2 = r2.mBackBitmap;	 Catch:{ all -> 0x00cb }
                r3 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00cb }
                r4 = 2;
                r3.mState = r4;	 Catch:{ all -> 0x00cb }
                monitor-exit(r0);	 Catch:{ all -> 0x00cb }
                r0 = r1 + -2;
                r3 = 1;
                r5 = 0;
                r6 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ Exception -> 0x0038 }
                r6 = r6.mFrameSequenceState;	 Catch:{ Exception -> 0x0038 }
                r0 = r6.getFrame(r1, r2, r0);	 Catch:{ Exception -> 0x0038 }
                r2 = 0;
                goto L_0x005c;
            L_0x0038:
                r0 = move-exception;
                r0 = java.lang.String.valueOf(r0);
                r1 = r0.length();
                r2 = new java.lang.StringBuilder;
                r1 = r1 + 25;
                r2.<init>(r1);
                r1 = "exception during decode: ";
                r2.append(r1);
                r2.append(r0);
                r0 = r2.toString();
                r1 = "FrameSequence";
                android.util.Log.e(r1, r0);
                r0 = 0;
                r2 = 1;
            L_0x005c:
                r6 = 20;
                r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
                if (r8 < 0) goto L_0x0063;
            L_0x0062:
                goto L_0x0065;
            L_0x0063:
                r0 = 100;
            L_0x0065:
                r6 = android.support.rastermill.FrameSequenceDrawable.this;
                r6 = r6.mLock;
                monitor-enter(r6);
                r7 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                r7 = r7.mDestroyed;	 Catch:{ all -> 0x00c8 }
                r8 = 0;
                if (r7 == 0) goto L_0x0082;
            L_0x0075:
                r0 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                r0 = r0.mBackBitmap;	 Catch:{ all -> 0x00c8 }
                r1 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                r1.mBackBitmap = r8;	 Catch:{ all -> 0x00c8 }
                r8 = r0;
                goto L_0x00ac;
            L_0x0082:
                r7 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                r7 = r7.mNextFrameToDecode;	 Catch:{ all -> 0x00c8 }
                if (r7 < 0) goto L_0x00ac;
            L_0x008a:
                r7 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                r7 = r7.mState;	 Catch:{ all -> 0x00c8 }
                if (r7 == r4) goto L_0x0093;
            L_0x0092:
                goto L_0x00ac;
            L_0x0093:
                r4 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                if (r2 != 0) goto L_0x009d;
            L_0x0097:
                r9 = r4.mLastSwap;	 Catch:{ all -> 0x00c8 }
                r0 = r0 + r9;
                goto L_0x00a2;
            L_0x009d:
                r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            L_0x00a2:
                r4.mNextSwap = r0;	 Catch:{ all -> 0x00c8 }
                r0 = android.support.rastermill.FrameSequenceDrawable.this;	 Catch:{ all -> 0x00c8 }
                r1 = 3;
                r0.mState = r1;	 Catch:{ all -> 0x00c8 }
                r5 = 1;
            L_0x00ac:
                monitor-exit(r6);	 Catch:{ all -> 0x00c8 }
                if (r5 == 0) goto L_0x00bc;
            L_0x00af:
                r0 = android.support.rastermill.FrameSequenceDrawable.sMainHandler;
                r1 = android.support.rastermill.FrameSequenceDrawable.this;
                r1 = r1.mUiScheduleRunnable;
                r0.post(r1);
            L_0x00bc:
                if (r8 == 0) goto L_0x00c7;
            L_0x00be:
                r0 = android.support.rastermill.FrameSequenceDrawable.this;
                r0 = r0.mBitmapProvider;
                r0.releaseBitmap(r8);
            L_0x00c7:
                return;
            L_0x00c8:
                r0 = move-exception;
                monitor-exit(r6);	 Catch:{ all -> 0x00c8 }
                throw r0;
            L_0x00cb:
                r1 = move-exception;
                monitor-exit(r0);	 Catch:{ all -> 0x00cb }
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.rastermill.FrameSequenceDrawable$AnonymousClass2.run():void");
            }
        };
        this.mUiScheduleRunnable = new Runnable() {
            public void run() {
                FrameSequenceDrawable frameSequenceDrawable = FrameSequenceDrawable.this;
                super.unscheduleSelf(frameSequenceDrawable);
                frameSequenceDrawable = FrameSequenceDrawable.this;
                frameSequenceDrawable.scheduleSelf(frameSequenceDrawable, frameSequenceDrawable.mNextSwap);
            }
        };
        this.mFinishedCallbackRunnable = new Runnable() {
            public void run() {
                synchronized (FrameSequenceDrawable.this.mLock) {
                    FrameSequenceDrawable.this.mNextFrameToDecode = -1;
                    FrameSequenceDrawable.this.mState = 0;
                }
                if (FrameSequenceDrawable.this.mOnFinishedListener != null) {
                    FrameSequenceDrawable.this.mOnFinishedListener.onFinished(FrameSequenceDrawable.this);
                }
            }
        };
        if (frameSequence == null || bitmapProvider == null) {
            throw new IllegalArgumentException();
        }
        this.mFrameSequence = frameSequence;
        this.mFrameSequenceState = frameSequence.createState();
        int width = frameSequence.getWidth();
        int height = frameSequence.getHeight();
        this.mBitmapProvider = bitmapProvider;
        this.mFrontBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mBackBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mSrcRect = new Rect(0, 0, width, height);
        this.mPaint = new Paint();
        this.mPaint.setFilterBitmap(true);
        this.mFrontBitmapShader = new BitmapShader(this.mFrontBitmap, TileMode.CLAMP, TileMode.CLAMP);
        this.mBackBitmapShader = new BitmapShader(this.mBackBitmap, TileMode.CLAMP, TileMode.CLAMP);
        this.mLastSwap = 0;
        this.mNextFrameToDecode = -1;
        this.mFrameSequenceState.getFrame(0, this.mFrontBitmap, -1);
        initializeDecodingThread();
    }

    public final void setCircleMaskEnabled(boolean z) {
        if (this.mCircleMaskEnabled != z) {
            this.mCircleMaskEnabled = z;
            this.mPaint.setAntiAlias(z);
            invalidateSelf();
        }
    }

    public final boolean getCircleMaskEnabled() {
        return this.mCircleMaskEnabled;
    }

    private void checkDestroyedLocked() {
        if (this.mDestroyed) {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        }
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mDestroyed;
        }
        return z;
    }

    public void destroy() {
        if (this.mBitmapProvider != null) {
            Bitmap bitmap;
            Bitmap bitmap2;
            synchronized (this.mLock) {
                checkDestroyedLocked();
                bitmap = this.mFrontBitmap;
                bitmap2 = null;
                this.mFrontBitmap = null;
                if (this.mState != 2) {
                    Bitmap bitmap3 = this.mBackBitmap;
                    this.mBackBitmap = null;
                    bitmap2 = bitmap3;
                }
                this.mDestroyed = true;
            }
            this.mBitmapProvider.releaseBitmap(bitmap);
            if (bitmap2 != null) {
                this.mBitmapProvider.releaseBitmap(bitmap2);
                return;
            }
            return;
        }
        throw new IllegalStateException("BitmapProvider must be non-null");
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            this.mFrameSequenceState.destroy();
        } finally {
            super.finalize();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        synchronized (this.mLock) {
            checkDestroyedLocked();
            if (this.mState == 3 && this.mNextSwap - SystemClock.uptimeMillis() <= 0) {
                this.mState = 4;
            }
            if (isRunning() && this.mState == 4) {
                Bitmap bitmap = this.mBackBitmap;
                this.mBackBitmap = this.mFrontBitmap;
                this.mFrontBitmap = bitmap;
                BitmapShader bitmapShader = this.mBackBitmapShader;
                this.mBackBitmapShader = this.mFrontBitmapShader;
                this.mFrontBitmapShader = bitmapShader;
                this.mLastSwap = SystemClock.uptimeMillis();
                if (this.mNextFrameToDecode == this.mFrameSequence.getFrameCount() - 1) {
                    i = this.mCurrentLoop + 1;
                    this.mCurrentLoop = i;
                    int i2 = this.mLoopBehavior;
                    if (i2 == 1) {
                        if (i != this.mLoopCount) {
                        }
                    } else if (i2 == 3) {
                        if (i != this.mFrameSequence.getDefaultLoopCount()) {
                        }
                    }
                    scheduleSelf(this.mFinishedCallbackRunnable, 0);
                }
                scheduleDecodeLocked();
            }
        }
        if (this.mCircleMaskEnabled) {
            Rect bounds = getBounds();
            i = getIntrinsicWidth();
            float f = (float) i;
            float width = ((float) bounds.width()) / f;
            float intrinsicHeight = (float) getIntrinsicHeight();
            float height = ((float) bounds.height()) / intrinsicHeight;
            canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            canvas.scale(width, height);
            float min = (float) Math.min(bounds.width(), bounds.height());
            width = min / width;
            min /= height;
            this.mTempRectF.set((f - width) / 2.0f, (intrinsicHeight - min) / 2.0f, (f + width) / 2.0f, (intrinsicHeight + min) / 2.0f);
            this.mPaint.setShader(this.mFrontBitmapShader);
            canvas.drawOval(this.mTempRectF, this.mPaint);
            canvas.restore();
            return;
        }
        this.mPaint.setShader(null);
        canvas.drawBitmap(this.mFrontBitmap, this.mSrcRect, getBounds(), this.mPaint);
    }

    private void scheduleDecodeLocked() {
        this.mState = 1;
        this.mNextFrameToDecode = (this.mNextFrameToDecode + 1) % this.mFrameSequence.getFrameCount();
        sDecodingThreadHandler.post(this.mDecodeRunnable);
    }

    public void run() {
        Object obj;
        synchronized (this.mLock) {
            obj = null;
            if (this.mNextFrameToDecode >= 0 && this.mState == 3) {
                this.mState = 4;
                obj = 1;
            }
        }
        if (obj != null) {
            invalidateSelf();
        }
    }

    public void start() {
        if (!isRunning()) {
            synchronized (this.mLock) {
                checkDestroyedLocked();
                if (this.mState == 1) {
                } else {
                    this.mCurrentLoop = 0;
                    scheduleDecodeLocked();
                }
            }
        }
    }

    public void stop() {
        if (isRunning()) {
            unscheduleSelf(this);
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0) {
                if (!this.mDestroyed) {
                    z = true;
                }
            }
        }
        return z;
    }

    public void unscheduleSelf(Runnable runnable) {
        synchronized (this.mLock) {
            this.mNextFrameToDecode = -1;
            this.mState = 0;
        }
        super.unscheduleSelf(runnable);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (z2 || visible) {
            stop();
            start();
        }
        return visible;
    }

    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return this.mFrameSequence.getWidth();
    }

    public int getIntrinsicHeight() {
        return this.mFrameSequence.getHeight();
    }

    public int getOpacity() {
        return !this.mFrameSequence.isOpaque() ? -2 : -1;
    }
}
