/*Primero socios*/
insert into socios(id,cedula,nombre,apellido,fecha_nac,num_celular,genero,email,lugar_nacimiento,personas_dependientes,profecion,direccion,provincia,ciudad,parroquia,sector,referencia,telefono,tipo_casa,tiempo_recidencia,propietario) values (1,'0104050203','Carmen', 'Tacuri', '1974-01-04', '0959678423', 'Mujer', 'tacurijuanita@hotmail.com', 'Cuenca', 'Si', 'Doctora', 'Calle Sangurima', 'Azuay', 'Cuenca', 'Monay', 'El Arenal', 'Feria Libre', '045678901', 'Propia', '10 A', 'Carmen Tacuri');
insert into socios(id,cedula,nombre,apellido,fecha_nac,num_celular,genero,email,lugar_nacimiento,personas_dependientes,profecion,direccion,provincia,ciudad,parroquia,sector,referencia,telefono,tipo_casa,tiempo_recidencia,propietario) values (2,'0205060304','Patricia', 'Tacuri', '1975-01-04', '0935955499', 'Mujer', 'pa@hotmail.com', 'Tarqui', 'No', 'Programador', 'A. Americas', 'Loja', 'Loja', 'Santiago', 'Parque central', 'Frente ala parque', '056789012', 'Arrendada', '15 A', 'Bryan Salazar');
insert into socios(id,cedula,nombre,apellido,fecha_nac,num_celular,genero,email,lugar_nacimiento,personas_dependientes,profecion,direccion,provincia,ciudad,parroquia,sector,referencia,telefono,tipo_casa,tiempo_recidencia,propietario) values (3,'0306070405','Luis', 'Villa', '1976-01-04', '0955997846', 'Hombre', 'villa@hotmail.com', 'Loja', 'Si', 'Ingeniero', 'AV. Pumapungo ', 'Pichincha', 'Quito', 'La Magdalena', 'Valles', 'frente a la iglecia', '023456789', 'Cedida', '2 A', 'Santiago Dominguez');
insert into socios(id,cedula,nombre,apellido,fecha_nac,num_celular,genero,email,lugar_nacimiento,personas_dependientes,profecion,direccion,provincia,ciudad,parroquia,sector,referencia,telefono,tipo_casa,tiempo_recidencia,propietario) values (4,'0407080506','Tomas', 'Erazo', '1964-01-04', '0983742239', 'Hombre', 'tomas@hotmail.com', 'Guayaquil', 'No', 'Arquitecto', 'S. Cordova 22', 'Tunguragua', 'Ambato', 'Pasa', 'Rio Patate', 'Tras el trerminal', '034567890', 'Propia', '6 A', 'Tomaz Erazo');
insert into socios(id,cedula,nombre,apellido,fecha_nac,num_celular,genero,email,lugar_nacimiento,personas_dependientes,profecion,direccion,provincia,ciudad,parroquia,sector,referencia,telefono,tipo_casa,tiempo_recidencia,propietario) values (5,'0508090607','Daniela', 'Rosero', '1992-01-04', '0973847422', 'Mujer', 'danny@hotmail.com', 'Quito', 'Si', 'Enfermera', 'La Calle', 'El Oro', 'Machala', 'El Cambio', 'NOSE', 'salia de la ciudad', '067890123', 'Arrendada', '25 A', 'Derek Vergara');

/*Segundo negocios*/
INSERT INTO negocios (id, ruc, cedula_socio, antiguedad, num_empleados, locales, lugar_ventas, tiempo_local, local_hipotecado, ciudad, direccion, telefono, referencia) VALUES (1, '0102030405001', '0104050203', 10, 5, 1, 'Cuenca', 5, FALSE, 'Cuenca', 'Calle A', '0991234567', 'Referencia A');
INSERT INTO negocios (id, ruc, cedula_socio, antiguedad, num_empleados, locales, lugar_ventas, tiempo_local, local_hipotecado, ciudad, direccion, telefono, referencia) VALUES (2, '0203040506001', '0205060304', 8, 4, 2, 'Quito', 6, TRUE, 'Quito', 'Calle B', '0992345678', 'Referencia B');
INSERT INTO negocios (id, ruc, cedula_socio, antiguedad, num_empleados, locales, lugar_ventas, tiempo_local, local_hipotecado, ciudad, direccion, telefono, referencia) VALUES (3, '0304050607001', '0306070405', 12, 6, 3, 'Guayaquil', 7, FALSE, 'Guayaquil', 'Calle C', '0993456789', 'Referencia C');
INSERT INTO negocios (id, ruc, cedula_socio, antiguedad, num_empleados, locales, lugar_ventas, tiempo_local, local_hipotecado, ciudad, direccion, telefono, referencia) VALUES (4, '0405060708001', '0407080506', 9, 3, 1, 'Loja', 4, TRUE, 'Loja', 'Calle D', '0994567890', 'Referencia D');
INSERT INTO negocios (id, ruc, cedula_socio, antiguedad, num_empleados, locales, lugar_ventas, tiempo_local, local_hipotecado, ciudad, direccion, telefono, referencia) VALUES (5, '0506070809001', '0508090607', 11, 7, 2, 'Ambato', 5, FALSE, 'Ambato', 'Calle E', '0995678901', 'Referencia E');


/*Tercero registros*/
INSERT INTO registros (id, cedula_socio, buro, referencias_c, c_crediticio) VALUES (1, '0104050203', 'Información de crédito A', 'Referencia A', 'Buen comportamiento');
INSERT INTO registros (id, cedula_socio, buro, referencias_c, c_crediticio) VALUES (2, '0205060304', 'Información de crédito B', 'Referencia B', 'Comportamiento regular');
INSERT INTO registros (id, cedula_socio, buro, referencias_c, c_crediticio) VALUES (3, '0306070405', 'Información de crédito C', 'Referencia C', 'Excelente comportamiento');
INSERT INTO registros (id, cedula_socio, buro, referencias_c, c_crediticio) VALUES (4, '0407080506', 'Información de crédito D', 'Referencia D', 'Comportamiento deficiente');
INSERT INTO registros (id, cedula_socio, buro, referencias_c, c_crediticio) VALUES (5, '0508090607', 'Información de crédito E', 'Referencia E', 'Buen comportamiento');

/*Cuarto conyugues*/
INSERT INTO conyugues (cedula, cedula_socio, Nombre, fecha_nac, profecion, ocupacion, empresa, direccion, area, anios, telefono) VALUES ('0102040506', '0104050203', 'Juan Perez', '1975-05-15', 'Ingeniero', 'Gerente', 'Empresa A', 'Calle 1', 'Administración', 10, '0991234567');
INSERT INTO conyugues (cedula, cedula_socio, Nombre, fecha_nac, profecion, ocupacion, empresa, direccion, area, anios, telefono) VALUES ('0203040506', '0205060304', 'Ana Gomez', '1980-06-20', 'Abogada', 'Consultora', 'Empresa B', 'Calle 2', 'Legal', 8, '0992345678');
INSERT INTO conyugues (cedula, cedula_socio, Nombre, fecha_nac, profecion, ocupacion, empresa, direccion, area, anios, telefono) VALUES ('0304050607', '0306070405', 'Luis Lopez', '1985-07-25', 'Médico', 'Doctor', 'Hospital C', 'Calle 3', 'Salud', 12, '0993456789');
INSERT INTO conyugues (cedula, cedula_socio, Nombre, fecha_nac, profecion, ocupacion, empresa, direccion, area, anios, telefono) VALUES ('0405060708', '0407080506', 'María Martinez', '1990-08-30', 'Arquitecta', 'Diseñadora', 'Estudio D', 'Calle 4', 'Diseño', 5, '0994567890');
INSERT INTO conyugues (cedula, cedula_socio, Nombre, fecha_nac, profecion, ocupacion, empresa, direccion, area, anios, telefono) VALUES ('0506070809', '0508090607', 'Carlos Ramirez', '1995-09-05', 'Economista', 'Analista', 'Empresa E', 'Calle 5', 'Finanzas', 7, '0995678901');

/*Quinto gastos*/
INSERT INTO gastos (id, cedula_socio, transporte, pago_pensiones, vestuario, pago_deudas, salud, educacion, servicios_basicos, arriendos, alimentacion) VALUES (1, '0104050203', 200.50, 150.00, 100.00, 250.75, 50.00, 300.00, 100.00, 200.00, 350.00);
INSERT INTO gastos (id, cedula_socio, transporte, pago_pensiones, vestuario, pago_deudas, salud, educacion, servicios_basicos, arriendos, alimentacion) VALUES (2, '0205060304', 180.00, 120.00, 90.00, 230.00, 60.00, 310.00, 110.00, 210.00, 340.00);
INSERT INTO gastos (id, cedula_socio, transporte, pago_pensiones, vestuario, pago_deudas, salud, educacion, servicios_basicos, arriendos, alimentacion) VALUES (3, '0306070405', 190.00, 130.00, 95.00, 240.00, 55.00, 305.00, 105.00, 205.00, 345.00);
INSERT INTO gastos (id, cedula_socio, transporte, pago_pensiones, vestuario, pago_deudas, salud, educacion, servicios_basicos, arriendos, alimentacion) VALUES (4, '0407080506', 210.00, 160.00, 105.00, 260.00, 70.00, 320.00, 120.00, 220.00, 355.00);
INSERT INTO gastos (id, cedula_socio, transporte, pago_pensiones, vestuario, pago_deudas, salud, educacion, servicios_basicos, arriendos, alimentacion) VALUES (5, '0508090607', 220.00, 170.00, 110.00, 270.00, 75.00, 330.00, 125.00, 230.00, 360.00);


INSERT INTO empresas (id, cedula_socio, ocupa_empresa,nom_empresa,direc_empresa,area_empresa,anios_empresa,telef_empresa) VALUES (1, '0104050203', 'Ingeniero', 'Empresa A', 'Calle 1', 'Administración', 10, '0991234567');
INSERT INTO empresas (id, cedula_socio, ocupa_empresa,nom_empresa,direc_empresa,area_empresa,anios_empresa,telef_empresa) VALUES (2, '0205060304', 'Abogado', 'Empresa B', 'Calle 2', 'Legal', 8, '0992345678');
INSERT INTO empresas (id, cedula_socio, ocupa_empresa,nom_empresa,direc_empresa,area_empresa,anios_empresa,telef_empresa) VALUES (3, '0306070405', 'Médico', 'Hospital C', 'Calle 3', 'Salud', 12, '0993456789');
INSERT INTO empresas (id, cedula_socio, ocupa_empresa,nom_empresa,direc_empresa,area_empresa,anios_empresa,telef_empresa) VALUES (4, '0407080506', 'Arquitecto', 'Estudio D', 'Calle 4', 'Diseño', 5, '0994567890');
INSERT INTO empresas (id, cedula_socio, ocupa_empresa,nom_empresa,direc_empresa,area_empresa,anios_empresa,telef_empresa) VALUES (5, '0508090607', 'Economista', 'Empresa E', 'Calle 5', 'Finanzas', 7, '0995678901');

INSERT INTO ingresos (Id, CedSocioIngr, PorIntGanadIngr, PorPenRecIngr, PorAlquiVehiIngr, PorArriReciIngr, GananciaGanaIngr, GananciaAgriIngr, GananciaComerIngr, SueldConyugIngr, SueldSocioIngr) VALUES (1, '0104050203', 150.00, 200.00, 100.00, 250.00, 300.00, 350.00, 400.00, 450.00, 500.00);
INSERT INTO ingresos (Id, CedSocioIngr, PorIntGanadIngr, PorPenRecIngr, PorAlquiVehiIngr, PorArriReciIngr, GananciaGanaIngr, GananciaAgriIngr, GananciaComerIngr, SueldConyugIngr, SueldSocioIngr) VALUES(2, '0205060304', 140.00, 210.00, 110.00, 240.00, 310.00, 360.00, 410.00, 460.00, 510.00);
INSERT INTO ingresos (Id, CedSocioIngr, PorIntGanadIngr, PorPenRecIngr, PorAlquiVehiIngr, PorArriReciIngr, GananciaGanaIngr, GananciaAgriIngr, GananciaComerIngr, SueldConyugIngr, SueldSocioIngr) VALUES(3, '0306070405', 130.00, 220.00, 120.00, 230.00, 320.00, 370.00, 420.00, 470.00, 520.00);
INSERT INTO ingresos (Id, CedSocioIngr, PorIntGanadIngr, PorPenRecIngr, PorAlquiVehiIngr, PorArriReciIngr, GananciaGanaIngr, GananciaAgriIngr, GananciaComerIngr, SueldConyugIngr, SueldSocioIngr) VALUES(4, '0407080506', 160.00, 190.00, 130.00, 220.00, 330.00, 380.00, 430.00, 480.00, 530.00);
INSERT INTO ingresos (Id, CedSocioIngr, PorIntGanadIngr, PorPenRecIngr, PorAlquiVehiIngr, PorArriReciIngr, GananciaGanaIngr, GananciaAgriIngr, GananciaComerIngr, SueldConyugIngr, SueldSocioIngr) VALUES(5, '0508090607', 170.00, 180.00, 140.00, 210.00, 340.00, 390.00, 440.00, 490.00, 540.00);

INSERT INTO inmobiliarios (id,ced_socio_inmobi,direcc_inmobi,valor_inmobi,hipotec_inmobi,institu_inmobi,tip_propie_inmobi) VALUES (1, '0104050203', 'Calle F', 100000.00, TRUE, 'Banco F', 'Casa');
INSERT INTO inmobiliarios (id,ced_socio_inmobi,direcc_inmobi,valor_inmobi,hipotec_inmobi,institu_inmobi,tip_propie_inmobi) VALUES (2, '0205060304', 'Calle G', 150000.00, FALSE, 'Banco G', 'Departamento');
INSERT INTO inmobiliarios (id,ced_socio_inmobi,direcc_inmobi,valor_inmobi,hipotec_inmobi,institu_inmobi,tip_propie_inmobi) VALUES (3, '0306070405', 'Calle H', 200000.00, TRUE, 'Banco H', 'Terreno');
INSERT INTO inmobiliarios (id,ced_socio_inmobi,direcc_inmobi,valor_inmobi,hipotec_inmobi,institu_inmobi,tip_propie_inmobi) VALUES (4, '0407080506', 'Calle I', 250000.00, FALSE, 'Banco I', 'Local Comercial');
INSERT INTO inmobiliarios (id,ced_socio_inmobi,direcc_inmobi,valor_inmobi,hipotec_inmobi,institu_inmobi,tip_propie_inmobi) VALUES (5, '0508090607', 'Calle J', 300000.00, TRUE, 'Banco J', 'Bodega');    

INSERT INTO creditos_activos (id,ced_socio_credit_act,bien_muebcred_act,vehicu_cred_act,herr_maqui_cred_act,inver_gan_cred_act,	inver_cult_cred_act,inven_mercade_cred_act,	cuent_cobra_cred_act,deposit_inst_cred_act,caja_cred_act) VALUES (1, '0104050203', 200000.00, 15000.00, 10000.00, 8000.00, 6000.00, 12000.00, 10000.00, 5000.00, 3000.00);
INSERT INTO creditos_activos (id,ced_socio_credit_act,bien_muebcred_act,vehicu_cred_act,herr_maqui_cred_act,inver_gan_cred_act,	inver_cult_cred_act,inven_mercade_cred_act,	cuent_cobra_cred_act,deposit_inst_cred_act,caja_cred_act) VALUES (2, '0205060304', 180000.00, 14000.00, 9000.00, 7500.00, 5500.00, 11500.00, 9500.00, 4500.00, 2800.00);
INSERT INTO creditos_activos (id,ced_socio_credit_act,bien_muebcred_act,vehicu_cred_act,herr_maqui_cred_act,inver_gan_cred_act,	inver_cult_cred_act,inven_mercade_cred_act,	cuent_cobra_cred_act,deposit_inst_cred_act,caja_cred_act) VALUES (3, '0306070405', 160000.00, 13000.00, 8000.00, 7000.00, 5000.00, 11000.00, 9000.00, 4000.00, 2600.00);
INSERT INTO creditos_activos (id,ced_socio_credit_act,bien_muebcred_act,vehicu_cred_act,herr_maqui_cred_act,inver_gan_cred_act,	inver_cult_cred_act,inven_mercade_cred_act,	cuent_cobra_cred_act,deposit_inst_cred_act,caja_cred_act) VALUES (4, '0407080506', 140000.00, 12000.00, 7000.00, 6500.00, 4500.00, 10500.00, 8500.00, 3500.00, 2400.00);
INSERT INTO creditos_activos (id,ced_socio_credit_act,bien_muebcred_act,vehicu_cred_act,herr_maqui_cred_act,inver_gan_cred_act,	inver_cult_cred_act,inven_mercade_cred_act,	cuent_cobra_cred_act,deposit_inst_cred_act,caja_cred_act) VALUES (5, '0508090607', 120000.00, 11000.00, 6000.00, 6000.00, 4000.00, 10000.00, 8000.00, 3000.00, 2200.00);

INSERT INTO creditos_pasivos (id,cedula_socio,deudalmacredpas,deud_tarj_cred_pas,deud_prov_cred_pas,deud_banc_cred_pas,deud_coop_cred_pas) VALUES (1, '0104050203', 2000.00, 1500.00, 1000.00, 5000.00, 3000.00);
INSERT INTO creditos_pasivos (id,cedula_socio,deudalmacredpas,deud_tarj_cred_pas,deud_prov_cred_pas,deud_banc_cred_pas,deud_coop_cred_pas) VALUES (2, '0205060304', 1800.00, 1400.00, 900.00, 4500.00, 2800.00);
INSERT INTO creditos_pasivos (id,cedula_socio,deudalmacredpas,deud_tarj_cred_pas,deud_prov_cred_pas,deud_banc_cred_pas,deud_coop_cred_pas) VALUES (3, '0306070405', 1600.00, 1300.00, 800.00, 4000.00, 2600.00);
INSERT INTO creditos_pasivos (id,cedula_socio,deudalmacredpas,deud_tarj_cred_pas,deud_prov_cred_pas,deud_banc_cred_pas,deud_coop_cred_pas) VALUES (4, '0407080506', 1400.00, 1200.00, 700.00, 3500.00, 2400.00);
INSERT INTO creditos_pasivos (id,cedula_socio,deudalmacredpas,deud_tarj_cred_pas,deud_prov_cred_pas,deud_banc_cred_pas,deud_coop_cred_pas) VALUES (5, '0508090607', 1200.00, 1100.00, 600.00, 3000.00, 2200.00);

INSERT INTO creditos (id,ced_socio_credit, num_solicitud,plazo_credit,val_soli_credit,provincia_credit,ciudad_credit,inversion_credit,tipo_credit, form_pag_credit,estado_credit) VALUES (1, '0104050203', '2024-01-01', 12, 5000.00, 'Azuay', 'Cuenca', 'Negocio', 'Personal', 'Mensual', 'Aprobado');
INSERT INTO creditos (id,ced_socio_credit, num_solicitud,plazo_credit,val_soli_credit,provincia_credit,ciudad_credit,inversion_credit,tipo_credit, form_pag_credit,estado_credit) VALUES (2, '0205060304', '2024-02-01', 24, 10000.00, 'Pichincha', 'Quito', 'Inmobiliario', 'Hipotecario', 'Mensual', 'Pendiente');
INSERT INTO creditos (id,ced_socio_credit, num_solicitud,plazo_credit,val_soli_credit,provincia_credit,ciudad_credit,inversion_credit,tipo_credit, form_pag_credit,estado_credit) VALUES (3, '0306070405', '2024-03-01', 36, 15000.00, 'Guayas', 'Guayaquil', 'Vehículo', 'Automotriz', 'Mensual', 'Rechazado');
INSERT INTO creditos (id,ced_socio_credit, num_solicitud,plazo_credit,val_soli_credit,provincia_credit,ciudad_credit,inversion_credit,tipo_credit, form_pag_credit,estado_credit) VALUES (4, '0407080506', '2024-04-01', 48, 20000.00, 'Loja', 'Loja', 'Educación', 'Estudiantil', 'Mensual', 'Aprobado');
INSERT INTO creditos (id,ced_socio_credit, num_solicitud,plazo_credit,val_soli_credit,provincia_credit,ciudad_credit,inversion_credit,tipo_credit, form_pag_credit,estado_credit) VALUES (5, '0508090607', '2024-05-01', 60, 25000.00, 'Tungurahua', 'Ambato', 'Comercio', 'Comercial', 'Mensual', 'Pendiente');





