package com.consultoraestrategia.ss_crmeducativo.asistencia.events;

/**
 * Created by kelvi on 06/03/2017.
 */

public class AsistenciaEvent {
    public static final int onGetListaAlumnosSuccess = 1;
    public static final int onGetListaAlumnosError = -1;
    public static final int onInitListViewSuccess = 2;
    public static final int onInitListViewError = -2;
    public static final int onChangeStateFabButtonsSuccess = 3;
    public static final int onChangeStateFabButtonsError = -3;

    public int typeEvent;
    public String error;


    public int getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(int typeEvent) {
        this.typeEvent = typeEvent;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
