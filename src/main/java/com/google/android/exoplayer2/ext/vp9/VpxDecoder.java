package com.google.android.exoplayer2.ext.vp9;

import android.view.Surface;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import defpackage.aocf;
import defpackage.odf;
import defpackage.odj;
import defpackage.odl;
import defpackage.odm;
import defpackage.odo;
import defpackage.oey;
import defpackage.oez;
import java.nio.ByteBuffer;

public final class VpxDecoder extends odl {
    public final long a;
    public volatile int b;
    private final ExoMediaCrypto c;

    public VpxDecoder(int i, int i2, int i3, ExoMediaCrypto exoMediaCrypto, boolean z, boolean z2, int i4) {
        super(new oey[i], new VpxOutputBuffer[i2]);
        if (VpxLibrary.a()) {
            this.c = exoMediaCrypto;
            if (exoMediaCrypto == null || VpxLibrary.vpxIsSecureDecodeSupported()) {
                long vpxInit = vpxInit(false, z2, i4);
                this.a = vpxInit;
                if (vpxInit != 0) {
                    a(i3);
                    return;
                }
                throw new oez("Failed to initialize decoder");
            }
            throw new oez("Vpx decoder does not support secure decode.");
        }
        throw new oez("Failed to load decoder native libraries.");
    }

    private final native long vpxClose(long j);

    private final native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private final native int vpxGetErrorCode(long j);

    private final native String vpxGetErrorMessage(long j);

    private final native int vpxGetFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private final native long vpxInit(boolean z, boolean z2, int i);

    private final native int vpxReleaseFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private final native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, ExoMediaCrypto exoMediaCrypto, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    public final native int vpxRenderFrame(long j, Surface surface, VpxOutputBuffer vpxOutputBuffer);

    public final String a() {
        String valueOf = String.valueOf(VpxLibrary.a() ? VpxLibrary.vpxGetVersion() : null);
        String str = "libvpx";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(VpxOutputBuffer vpxOutputBuffer) {
        if (this.b == 1 && !vpxOutputBuffer.isDecodeOnly()) {
            vpxReleaseFrame(this.a, vpxOutputBuffer);
        }
        super.a((odm) vpxOutputBuffer);
    }

    public final void e() {
        super.e();
        vpxClose(this.a);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Exception a(odj odj, odm odm, boolean z) {
        long vpxSecureDecode;
        oey oey = (oey) odj;
        VpxOutputBuffer vpxOutputBuffer = (VpxOutputBuffer) odm;
        ByteBuffer byteBuffer = oey.b;
        int limit = byteBuffer.limit();
        odf odf = oey.a;
        if (oey.c()) {
            vpxSecureDecode = vpxSecureDecode(this.a, byteBuffer, limit, this.c, odf.c, odf.b, odf.a, odf.f, odf.d, odf.e);
        } else {
            vpxSecureDecode = vpxDecode(this.a, byteBuffer, limit);
        }
        if (vpxSecureDecode != 0) {
            String valueOf;
            String str;
            if (vpxSecureDecode == 2) {
                valueOf = String.valueOf(vpxGetErrorMessage(this.a));
                str = "Drm error: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                vpxGetErrorCode(this.a);
                return new oez(valueOf, new odo(valueOf));
            }
            valueOf = String.valueOf(vpxGetErrorMessage(this.a));
            str = "Decode error: ";
            return new oez(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } else if (oey.isDecodeOnly()) {
            return null;
        } else {
            vpxOutputBuffer.init(oey.c, this.b);
            int vpxGetFrame = vpxGetFrame(this.a, vpxOutputBuffer);
            if (vpxGetFrame == 1) {
                vpxOutputBuffer.addFlag(aocf.UNSET_ENUM_VALUE);
            } else if (vpxGetFrame == -1) {
                return new oez("Buffer initialization failed.");
            }
            vpxOutputBuffer.colorInfo = oey.d;
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ odm j() {
        return new VpxOutputBuffer(this);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ odj i() {
        return new oey();
    }
}
