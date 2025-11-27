# ArquitecturaMVVM - Proyecto Android (Kotlin / Java / Gradle)

## Descripción
Proyecto de ejemplo que implementa MVVM junto con Clean Architecture en Android. Uso de Kotlin, Java, Coroutines, Retrofit (o cliente HTTP), Dagger/Hilt (o DI), y Gradle. Este README explica la estructura, responsabilidades de capas y muestra diagramas para comprender el flujo.

## Tecnologías
- Lenguajes: Kotlin, Java
- Build: Gradle
- Concurrencia: Kotlin Coroutines
- Network: Retrofit / cliente HTTP
- Inyección de dependencias: Hilt / Dagger (opcional)
- Testing: JUnit, MockK / Mockito
- IDE: Android Studio Otter | 2025.2.1 (Windows)

## Objetivo
Separar responsabilidades para:
- Facilitar pruebas unitarias
- Mantener independencia entre UI y datos
- Hacer el código escalable y mantenible

---

## Principios aplicados
- MVVM: Model-View-ViewModel para separar lógica de UI de la vista.
- Clean Architecture: Capas concéntricas (Presentation, Domain, Data) y dependencias dirigidas hacia el dominio.

---

## Diagrama MVVM (flujo de datos)
```mermaid
flowchart LR
  View[View\n(Activity/Fragment/Compose)]
  ViewModel[ViewModel]
  UseCase[UseCase / Interactor]
  Repository[Repository]
  DataSource[Data Source\n(API / DB)]

  View --> |Eventos UI/Bindings| ViewModel
  ViewModel --> |Llama a| UseCase
  UseCase --> |Solicita datos a| Repository
  Repository --> |Lee/Escribe| DataSource
  DataSource --> |Respuesta| Repository
  Repository --> |Entrega| UseCase
  UseCase --> |Retorna| ViewModel
  ViewModel --> |Actualiza| View