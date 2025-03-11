## Bigdata platform

#### 빅데이터
 - 기존의 데이터 처리 응용 소프트웨어로는 처리하기 어려울 정도로 방대한 양의 데이터
 - 데이터로부터 가치를 추출하고 결과를 분석하는 기술
 - 3V: Volume, Velocity(속도), Variety - 점점 뜻이 확장되는 중

#### 플랫폼: 많은 사람들이 쉽게 이용할 수 있고 다양한 목적의 비즈니스가 이루어지는 공간
1. 하드웨어 플랫폼: 동일한 제품을 일정한 품질로 만드는 프로세스와 그 제품을 만드는 장치 ex) 자동차 플랫폼
2. 소프트웨어 플랫폼: **"하드웨어나 OS에 상관없이"** 소프트웨어를 실행할 수 있는 기반이나 환경 ex) Java platform
3. 서비스 플랫폼: 서비스 제공자의 서비스를 다른 서비스들이 쉽게 사용할 수 있게 해주는 환경 ex) 앱 스토어

#### 빅데이터 플랫폼: 기업 내에 많은 사용자들이 데이터를 처리하고 분석을 쉽게 할 수 있는 환경을 제공해주는 시스템

#### 빅데이터 플랫폼 요구사항
 - 데이터 수집, 처리 및 저장
 - 데이터 발견, 검색, 보안 제공
 - 데이터 분석 및 ML 지원

#### 빅데이터 아키텍처
 - Sources
 - Ingestion and Transformation 
 - Storage 
 - Analytics 
 - Output

## 빅데이터 아키텍처 (= 설계 도면)

#### Sources: 비지니스 데이터와 운영 데이터가 생성되는 단계
- Data의 종류 
  - 정형 데이터: RDBMS(관계형 데이터베이스), 스프레드시트 
  - 비정형 데이터: data lake, data warehouse, nosql 데이터베이스에 저장 
  - 반정형 데이터: JSON, XML, 웹 로그, 센서 데이터 (스키마 포함)
- Data Source의 종류
  - 데이터베이스 (OLTP): 트랜잭션이 많음, 빠른 처리, 정규화된 데이터, 테이블 많음, 현재 데이터
	- vs OLAP: 데이터가 많음, 느린 쿼리, 비 정규화 데이터, 테이블 적음, 이력 데이터
  - 이벤트 컬렉터: 사용자가 만드는 데이터, 이벤트
  - 로그: 서버 로그
  - API: 외부 서비스에서 데이터를 가져오기 위해서 사용 ex) PG사
  - 파일
  - 오브젝트 스토리지
  - 기타
 
#### Ingestion and Transformation: 수집과 처리 단계 (데이터 수집, 변형, 적재) = ETL
- 배치형 데이터 수집: 이미 어딘가에 존재하는 데이터를 정리해서 추출, workflow management 도움 필요
  - 데이터베이스
  - 파일
- 스트리밍형 데이터 수집: 지속적으로 들어오는 데이터 수집 (실시간 데이터), nosql 이용 또는 메시지큐 사용
  - 애플리케이션 이벤트
  - 로그
  - 센서 데이터
- 데이터 수집
  - Flume: Hadoop ecosystem에서 로그 데이터를 효율적으로 수집, 취합, 이동하기 위한 분산 애플리케이션
  - Scoop: Hadoop ecosystem에서 관계형 데이터베이스를 HDFS로 효율적으로 가져오기 위한 프로젝트
  - Kafka: 메세지 브로커, 최근에 가장 많이 사용됨
  - Nifi: 기술 전송 프로그램의 일부로 오픈소스화 되어있음, 소프트웨어 시스템 간 데이터 흐름 자동화
  - Fluentd: 다양한 로그들이나 데이터베이스로부터 데이터를 모아주는 오픈소스 수집 프로젝트
- 데이터 처리
  - 배치 처리: MapReduce, Spark, Hive
  - 스트림 처리 (실시간): Flink, Spark, Kafka
    - 잘못된 결과를 수정하기 어려움
    - 지연된 데이터를 처리하기 어려움
    - Lambda vs Kappa Architecture
    - <img width="631" alt="image" src="https://github.com/user-attachments/assets/8e06053c-3482-4e7e-b84b-0eb4287aad14" />
    - Kappa Architecture 에서는 메세지 브로커가 다양한 기능을 제공해 주어야 함
        
#### Storage: 쿼리와 프로세싱이 가능한 형태로 데이터를 저장하는 단계
- Data Warehouse: 데이터 분석을 위해 서로 다른 시스템의 데이터가 모델링이 되어있는 데이터베이스
  - 정형화된 데이터
  - 리포팅이나 분석 쿼리에 최적화
  - 클라우드 기반의 DW 많이 사용하는 추세 - Google BigQuery, amazon REDSHIFT, snowflake
- Data Lake: 데이터를 raw 형태로 저장 (원천 그대로)
  - 스트리밍 데이터, 비정형 데이터 등 다양한 종류의 데이터 저장
  - Parquet, ORC 포맷으로 Object Storage(S3나 HDFS)에 저장됨
  - 기존 data lake의 문제점: 트랜잭션 지원 불가, 데이터 update/delete 불가
  - 기존의 object storage에 다른 storage layer을 둬서 ACID, Upsert 기능 제공 - Apache Hudi, Delta Lake, Iceberg
  - Data Lakehouse: 더 발전된 data lake
- Nosql Database
  
#### Analytics: 데이터 탐색 및 분석
- 데이터 기반의 의사결정 가능, 머신러닝을 포함한 데이터 기반의 애플리케이션 구동 가능
- 대화형 쿼리 엔진 - trino, impala, presto
  - trino: 중간 결과를 disk가 아닌 메모리에 저장하여 처리, 빠름
- 실시간 분석 OLAP 데이터베이스 - Apache Druid, Pinot, Clickhouse
- 머신 러닝 - Apache spark, Amazon SageMaker, Azure Machine Learning
  
#### Output: 데이터 분석 결과를 보여주는 단계 (대시보드 리포팅, 애플리케이션 탑재)
- 목적
  - 데이터 기반 의사 결정
    - 비즈니스 의사 결정 도와주기
  - 데이터 기반 애플리케이션
    - 데이터의 도움을 받아 프로덕트를 향상시킴
- 시각화 툴 - Apache Superset, Redash, Tableau
  
#### Workflow Management: 데이터 파이프라인 작업에 대한 오케스트레이션 및 스케줄링, 워크플로우들을 관리하는 툴
- 정기적으로 Task를 실행하고 비정상적인 상태 감지 후 해결
- 오케스트레이션 프레임워크
- Apache Airflow, Luigi, Apache oozie, Azkaban
