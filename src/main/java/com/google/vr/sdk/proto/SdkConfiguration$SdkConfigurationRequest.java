package com.google.vr.sdk.proto;

import defpackage.anex;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;

public final class SdkConfiguration$SdkConfigurationRequest extends anxl implements anzf {
    public static final SdkConfiguration$SdkConfigurationRequest DEFAULT_INSTANCE;
    public static volatile anzq PARSER = null;
    public static final int REQUESTED_PARAMS_FIELD_NUMBER = 2;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public anex requestedParams_;
    public String sdkVersion_ = "";

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE);
        }

        public final Builder setSdkVersion(String str) {
            copyOnWrite();
            ((SdkConfiguration$SdkConfigurationRequest) this.instance).setSdkVersion(str);
            return this;
        }

        public final Builder setRequestedParams(anex anex) {
            copyOnWrite();
            ((SdkConfiguration$SdkConfigurationRequest) this.instance).setRequestedParams(anex);
            return this;
        }

        /* synthetic */ Builder(SdkConfiguration$1 sdkConfiguration$1) {
            this();
        }
    }

    private SdkConfiguration$SdkConfigurationRequest() {
    }

    private final void setSdkVersion(String str) {
        this.bitField0_ |= 1;
        this.sdkVersion_ = str;
    }

    private final void setRequestedParams(anex anex) {
        if (anex != null) {
            this.requestedParams_ = anex;
            this.bitField0_ |= 2;
            return;
        }
        throw new NullPointerException();
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001", new Object[]{"bitField0_", "sdkVersion_", "requestedParams_"});
            case 3:
                return new SdkConfiguration$SdkConfigurationRequest();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (SdkConfiguration$SdkConfigurationRequest.class) {
                        obj3 = PARSER;
                        if (obj3 == null) {
                            obj3 = new anxn(DEFAULT_INSTANCE);
                            PARSER = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest = new SdkConfiguration$SdkConfigurationRequest();
        DEFAULT_INSTANCE = sdkConfiguration$SdkConfigurationRequest;
        anxl.registerDefaultInstance(SdkConfiguration$SdkConfigurationRequest.class, sdkConfiguration$SdkConfigurationRequest);
    }
}
