package com.consultoraestrategia.ss_crmeducativo.asistencia;

import android.support.design.widget.FloatingActionButton;

import com.consultoraestrategia.ss_crmeducativo.asistencia.events.AsistenciaEvent;
import com.consultoraestrategia.ss_crmeducativo.lib.EventBus;
import com.consultoraestrategia.ss_crmeducativo.lib.GreenRobotEventBus;

//import com.consultoraestrategia.ss_crmeducativo.entities.Usuario_Table;
//import com.raizlabs.android.dbflow.sql.language.Select;


/**
 * Created by kelvi on 21/02/2017.
 */

public class AsistenciaRepositoryImpl implements AsistenciaRepository {


    private static final String TAG = "AsistenciaRepository";

    public AsistenciaRepositoryImpl() {

    }


    private void postEvent(int type, String error) {
        AsistenciaEvent asistenciaEvent = new AsistenciaEvent();
        asistenciaEvent.setTypeEvent(type);
        if (error != null) {
            asistenciaEvent.setError(error);
        }

        EventBus eventBus = GreenRobotEventBus.getInstance();
        eventBus.post(asistenciaEvent);
    }

    private void postEvent(int type) {
        postEvent(type, null);
    }


    @Override
    public void onGetListaAlumnos() {


    }

    @Override
    public void onInitListView() {

    }

    @Override
    public void changeStateFabButtons(FloatingActionButton btnCurrentState, FloatingActionButton btnAsistio, FloatingActionButton btnFalto, FloatingActionButton btnJustificado) {

    }


}
