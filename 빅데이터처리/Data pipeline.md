## 데이터 파이프라인

#### 파이프라인: 하나의 데이터 처리 단계의 출력이 다음 단계의 입력으로 이어지는 형태로 연결된 구조

#### 데이터 파이프라인: 다양한 소스에서 데이터를 변환하고 옮기는 일련의 과정을 구성한 시스템
- Source - Processing - Destination
- Logfile :point_right: Amazon S3 :point_right: Process :point_right: Amazon RedShift
- 필요성
  - 데이터 기반 의사 결정
    - 비즈니스 데이터 분석
    - 리포팅
  - 데이터 기반 애플리케이션
    - 머신러닝, 데이터 사이언스

- 데이터 팀 (직무 - 직군)
  - 데이터 엔지니어링 - 데이터 엔지니어
    - ⭐️**데이터 파이프라인**⭐️을 구축하고 관리하는 업무
    - 빅데이터를 처리할 수 있는 데이터 아키텍처 구성
    - 데이터 분석가/과학자 협업을 통해 필요한 요구사항 파악 및 처리
  - 데이터 분석 및 시각화 - 데이터 분석가
    - 정제되어 있는 데이터를 분석 → 데이터 리포팅 및 시각화
  - 데이터 사이언스 - 데이터 과학자
    - 데이터를 통해 미래에 대한 예측을 함

- 구축 방법
  - 예시 1
    - 데이터 소스 → 데이터 수집 → 데이터 웨어하우스 → 데이터 시각화
  - 예시 2
    - 데이터 소스 → 주기적 배치 프로세싱 → Data Lake → 쿼리 엔진을 통한 데이터 분석 → 대시보드
  - 예시 3
    - <img width="595" alt="image" src="https://github.com/user-attachments/assets/8e13ceb9-3321-4266-a56c-de7f649b31b6" />

#### 데이터 파이프라인 패턴

##### 데이터 분석: 과거에는 외부 / 내부 / 로그 데이터 각각 분석 시스템 따로 존재 → 모든 데이터를 DW에 적재
- 데이터 웨어하우스
  - RDB와는 다르게 대량의 데이터 처리 & 오래 보관하는 것에 최적화
  - 소량의 데이터를 자주 읽고 쓰는 데는 적합하지 않음
- 정규화된 스키마 vs 스타 스키마
  - RDB(관계형 데이터베이스)는 정규화를 통해 스키마를 설계하고 그에 맞게 데이터를 저장
    - 분석을 위한 쿼리에는 비효율적
  - DW(데이터 웨어하우스)는 분석을 위한 쿼리에 적합한 형태로 스키마 구성 → **스타 스키마**
    - <img width="285" alt="image" src="https://github.com/user-attachments/assets/3959eb27-70e6-4925-91e9-3717c28aaf06" />
    - 가운데 팩트 테이블을 두고 주변에 차원 테이블을 두는 형태
    - 서로 다른 스키마 구조를 가지고 있기 때문에 기존의 DB에서 DW에 맞게 변환 후 적재해야 함 = ⭐️ETL⭐️

##### ETL = Extract(추출) - Transform(변환) - Load(적재)

##### ELT = Extract(추출) - Load(적재) - Transform(변환)
###### 1. Extract - Load: 데이터 엔지니어
###### 2. Transform: 데이터 분석가 또는 과학자

- ETL → ELT
  - 데이터가 커지고 다양해지면서 ETL 과정이 굉장히 복잡해지는 문제 발생
  - 다양한 형태의 데이터들은 DW 가정해서 만들어지지 않았음
    - 이미지, 동영상, 음성 파일 등은 DW에 적재 불가
  - 데이터 추출 후 Data Lake에 먼저 저장하고 어떻게 처리할지 결정

- Data Lake: 데이터의 원래 형태와 포맷을 유지하여 저장
  - 1단계: 원본 데이터
  - 2단계: 분석용 데이터
  - 3단계: 피처 데이터 (ML, AI) / 집계 데이터
 
- Data Lake vs Data Warehouse
  - Data Lake: 원시 데이터 저장
    - 읽기 스키마: 데이터를 원시 형태로 보관하고, 사용할 때 형태와 구조를 부여하는 방식
  - Data Warehouse: 구조화된 데이터 모델로 변경하여 저장
    - 쓰기 스키마: DW에 어떤 데이터가 포함이 될지 결정을 하게 되는 것
