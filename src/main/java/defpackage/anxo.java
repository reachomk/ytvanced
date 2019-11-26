package defpackage;

import java.io.IOException;

/* renamed from: anxo */
public class anxo extends anvi {
    public final anxl defaultInstance;
    public anxl instance;
    public boolean isBuilt = false;

    public anxo(anxl anxl) {
        this.defaultInstance = anxl;
        this.instance = (anxl) anxl.dynamicMethod(anxu.NEW_MUTABLE_INSTANCE);
    }

    public final boolean isInitialized() {
        throw null;
    }

    public void copyOnWrite() {
        if (this.isBuilt) {
            anxl anxl = (anxl) this.instance.dynamicMethod(anxu.NEW_MUTABLE_INSTANCE);
            mergeFromInstance(anxl, this.instance);
            this.instance = anxl;
            this.isBuilt = false;
        }
    }

    public anxo clone() {
        anxo anxo = (anxo) ((anxl) getDefaultInstanceForType()).newBuilderForType();
        anxo.mergeFrom((anxl) buildPartial());
        return anxo;
    }

    public anxl buildPartial() {
        if (this.isBuilt) {
            return this.instance;
        }
        this.instance.makeImmutable();
        this.isBuilt = true;
        return this.instance;
    }

    public final anxl build() {
        anxl anxl = (anxl) buildPartial();
        if (anxl.isInitialized()) {
            return anxl;
        }
        throw anvi.newUninitializedMessageException(anxl);
    }

    /* Access modifiers changed, original: protected */
    public anxo internalMergeFrom(anxl anxl) {
        return mergeFrom(anxl);
    }

    public anxo mergeFrom(anxl anxl) {
        copyOnWrite();
        mergeFromInstance(this.instance, anxl);
        return this;
    }

    private void mergeFromInstance(anxl anxl, anxl anxl2) {
        anzs.a.a((Object) anxl).b(anxl, anxl2);
    }

    public anxl getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    public anxo mergeFrom(byte[] bArr, int i, int i2, anxa anxa) {
        copyOnWrite();
        try {
            anzs.a.a(this.instance).a(this.instance, bArr, 0, i2, new anvo(anxa));
            return this;
        } catch (anyg e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw anyg.a();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public anxo mergeFrom(byte[] bArr, int i, int i2) {
        return mergeFrom(bArr, 0, i2, anxa.b());
    }

    public anxo mergeFrom(anwf anwf, anxa anxa) {
        copyOnWrite();
        try {
            anzs.a.a(this.instance).a(this.instance, anwj.a(anwf), anxa);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
